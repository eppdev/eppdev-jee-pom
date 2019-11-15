/* FileName: ConfService.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import cn.eppdev.jee.share.entity.RestResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author jinlong.hao
 */
@Service
public class ConfService {

    static Logger logger = LoggerFactory.getLogger(ConfService.class);

    @Autowired
    EppdevConfService eppdevConfService;

    public RestResult<Map<String, String>> getAllConf(){
        try {
            Map<String, String> map = eppdevConfService.getAllConf();
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", map);
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    public RestResult<PageInfo<EppdevConf>> listAll(){
        try {
            EppdevConfParam confParam = new EppdevConfParam();
            confParam.buildOrderBy(EppdevConf.COLUMN_ID_);
            PageInfo<EppdevConf> pageInfo = eppdevConfService.list(confParam);
            for (EppdevConf conf: pageInfo.getList()){
                eppdevConfService.getAllConf().put(conf.getConfName(), conf.getConfValue());
            }
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", pageInfo);
        } catch ( Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    public RestResult<Integer> update(EppdevConf eppdevConf){
        try {
            Integer cnt = eppdevConfService.update(eppdevConf);
            if (cnt > 0){
                eppdevConfService.getAllConf().put(eppdevConf.getConfName(), eppdevConf.getConfValue());
                return new RestResult<>(RestResult.STATUS_SUCCESS, "保存成功", cnt);
            }else {
                return new RestResult<>(RestResult.STATUS_FAILED, "保存失败，无此配置？", cnt);
            }
        } catch ( Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }
}
