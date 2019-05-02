/* FileName: VersionService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.cg.entity.TableFileInfo;
import cn.eppdev.jee.cg.utils.GeneratorUtils;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevVersionParam;
import cn.eppdev.jee.share.entity.RestResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
@Transactional(readOnly = true)
public class VersionService {

    static Logger logger = LoggerFactory.getLogger(VersionService.class);

    @Autowired
    EppdevVersionService eppdevVersionService;

    @Autowired
    EppdevTableService eppdevTableService;

    @Autowired
    EppdevColumnService eppdevColumnService;

    @Autowired
    EppdevIndexService eppdevIndexService;

    public RestResult<EppdevVersion> get(String id){
        try {
            EppdevVersion version = eppdevVersionService.get(id);
            if (version != null){
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success!", version);
            }
            else {
                return new RestResult<>(RestResult.STATUS_FAILED, "this version does not exists？", null);
            }
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return  new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    /**
     * 添加一个新版本，具体逻辑如下：<br />
     * <ul>
     *     <li>1. 获取旧版本信息</li>
     *     <li>2. 判断新版本名称是否存在</li>
     *     <li>3. 保存新版本的信息</li>
     *     <li>4. 复制老版本的所有信息到新版本中（表信息、列信息、索引信息）</li>
     * </ul>
     * @param versionName 新版本名称
     * @param fromVersionId 老版本的id
     * @return 新的versionId
     */
    @Transactional(readOnly = false)
    public RestResult<String> add(String versionName, String fromVersionId){
        try {
            /**
             * 一、获取旧版本信息
             */
            EppdevVersion oldVersion = eppdevVersionService.get(fromVersionId);
            if (oldVersion == null) {
                return new RestResult<>(RestResult.STATUS_FAILED, "Source Version does NOT exists?", null);
            }

            /**
             * 二、判断新版本名称是否存在
             */
            EppdevVersionParam param = new EppdevVersionParam();
            param.setVersionName(versionName);
            PageInfo<EppdevVersion> pageInfo = eppdevVersionService.list(param);
            if (pageInfo.getTotal() > 0) {
                return new RestResult<>(RestResult.STATUS_FAILED, "Version name exists?", null);
            }

            /**
             * 三、保存新的版本信息
             */
            EppdevVersion newVersion = new EppdevVersion();
            newVersion.setVersionName(versionName);
            eppdevVersionService.save(newVersion);

            /**
             * 四、依次保存老版本的所有信息到新版本中
             */
            String newVersionId = newVersion.getId();
            for (EppdevTable table : oldVersion.getTableList()) {
                // 4.1 获取表中的列、所有信息
                List<EppdevColumn> columnList = eppdevColumnService.listByTableId(table.getId());
                List<EppdevIndex> indexList = eppdevIndexService.listByTableId(table.getId());

                // 4.2 保存表
                table.setId(null);
                table.setVersionId(newVersionId);
                eppdevTableService.save(table);
                String newTableId = table.getId();

                // 4.3 保存列信息
                for (EppdevColumn column : columnList) {
                    column.setTableId(newTableId);
                    column.setId(null);
                    eppdevColumnService.save(column);
                }

                // 4.4 保存索引信息
                for (EppdevIndex index : indexList) {
                    index.setTableId(newTableId);
                    index.setId(null);
                    eppdevIndexService.save(index);
                }
            }

            return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", newVersionId);
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    public RestResult<Integer> delete(String id){
        try{
            int cnt = eppdevVersionService.delete(id);
            if (cnt == 1){
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Failed. Version NOT exist?", 0);
            }
        }catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }

    public RestResult<PageInfo<EppdevVersion>> listAll(){
        try {
            PageInfo<EppdevVersion> pageInfo = eppdevVersionService.listAll();
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", pageInfo);
        } catch ( Exception e){
           logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
           return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    public List<TableFileInfo> listTableFileInfo(){
        return GeneratorUtils.getTableFileInfoList();
    }
}
