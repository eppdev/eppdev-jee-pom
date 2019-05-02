/* FileName: BasicController.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.rest;

import ${BASIC_PACKAGE_NAME}.commons.entity.BasicEntity;
import ${BASIC_PACKAGE_NAME}.commons.entity.RestResult;
import ${BASIC_PACKAGE_NAME}.commons.param.BasicParam;
import ${BASIC_PACKAGE_NAME}.commons.service.BasicService;
import ${BASIC_PACKAGE_NAME}.commons.service.SysService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ${AUTHOR_NAME}
 */
public abstract class BasicController<T extends BasicEntity, P extends BasicParam> {
    static Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    BasicService<T, P> service;

    @Autowired
    SysService sysService;

    @RequestMapping("/get/{id}")
    public RestResult<T> get(@PathVariable("id") String id) {
        logger.debug("{}/get/{}", getBasicUrl(), id);
        RestResult<T> restResult;
        try {
            T data = service.get(id);
            if (null == data) {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "数据不存在", null);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", data);
            }
        } catch (Exception e) {
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/get/{} -> result: {}", getBasicUrl(), id, restResult);
        return restResult;
    }


    @RequestMapping("/add")
    public RestResult<String> add(@RequestBody T entity) {
        RestResult<String> restResult = null;
        logger.debug("{}/add -> entity:{}", getBasicUrl(), entity);
        try {
            String userId = sysService.getCurrentUserId();
            if (userId != null) {
                entity.setCreateBy(userId);
                entity.setUpdateBy(userId);
            }
            int cnt = service.insert(entity);
            if (cnt == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "添加成功", entity.getId());
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "添加失败，数据重复？", null);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/add -> result:{}", getBasicUrl(), restResult);
        return restResult;
    }

    @RequestMapping("/delete/{id}")
    public RestResult<Integer> delete(@PathVariable("id") String id) {
        logger.debug("{}/delete/{}", getBasicUrl(), id);
        RestResult<Integer> restResult = null;
        try {
            String userId = sysService.getCurrentUserId();
            int count = service.delete(id, userId);
            if (count == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "删除成功", count);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "删除失败，数据不存在？", count);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/delete/{} -> result: {}", getBasicUrl(), id, restResult);
        return restResult;
    }

    @RequestMapping("/update")
    public RestResult<Integer> update(@RequestBody T entity) {
        logger.debug("{}/update -> entity:{}", getBasicUrl(), entity);
        RestResult<Integer> restResult = null;
        try {
            String userId = sysService.getCurrentUserId();
            if (userId != null && entity.getUpdateBy() == null){
                entity.setUpdateBy(userId);
            }
            int count = service.update(entity);
            if (count == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "更新成功", count);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "更新失败：关键字重复？", count);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/update -> restResult:{}", getBasicUrl(), restResult);
        return restResult;
    }

    @RequestMapping("/list")
    public RestResult<PageInfo<T>> list(@RequestBody P param) {
        logger.debug("{}/list -> param:{}", getBasicUrl(), param);
        RestResult<PageInfo<T>> restResult = null;
        try {
            PageInfo<T> pageInfo = service.list(param);
            restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", pageInfo);
        } catch (Exception e) {
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/list -> restResult:{}", getBasicUrl(), restResult);
        return restResult;
    }

    public abstract String getBasicUrl();

}
