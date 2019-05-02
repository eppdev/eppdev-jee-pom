/* FileName: IndexService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jinlong.hao
 */
@Service
public class IndexService {
    static Logger logger = LoggerFactory.getLogger(IndexService.class);

    @Autowired
    EppdevIndexService eppdevIndexService;

    public RestResult<String> add(EppdevIndex eppdevIndex){
        try{
            int cnt = eppdevIndexService.save(eppdevIndex);
            if (cnt == 1){
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", eppdevIndex.getId());
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Index name exist?", null);
            }
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    public RestResult<Integer> delete(String id){
        try {
            int cnt = eppdevIndexService.delete(id);
            if (cnt == 1){
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Index NOT exists?", cnt);
            }
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }

}
