/* FileName: VersionController.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.service.EppdevVersionService;
import cn.eppdev.jee.conf.service.VersionService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController("restVersionController")
@RequestMapping("/rest/mapper/version")
public class VersionController {
    static Logger logger = LoggerFactory.getLogger(VersionController.class);

    @Autowired
    EppdevVersionService eppdevVersionService;

    @Autowired
    VersionService versionService;

    @RequestMapping("/get/{id}")
    public RestResult<EppdevVersion> get(@PathVariable("id") String id){
        logger.debug("/rest/mapper/version/get/{}", id);
        RestResult<EppdevVersion> result = versionService.get(id);
        logger.debug("/rest/mapper/version/get/{} ->result:{}", id, result);
        return result;
    }

    @RequestMapping("/add")
    public RestResult<String> add(@RequestBody EppdevVersion version){
        logger.debug("/rest/mapper/version/add -> version:{}", version);
        RestResult<String> result = versionService.add(version.getVersionName(), version.getFromVersionId());
        logger.debug("/rest/mapper/version/add -> result:{}", result);
        return result;
    }


    @RequestMapping("/delete/{id}")
    public RestResult<Integer> delete(@PathVariable("id") String id){
        logger.debug("/rest/mapper/version/delete/{}", id);
        RestResult<Integer> result = versionService.delete(id);
        logger.debug("/rest/mapper/version/delete/{} -> result:{}", id, result);
        return result;
    }

}
