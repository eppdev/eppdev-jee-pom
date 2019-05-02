/* FileName: EppdevIndexService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.param.EppdevIndexParam;
import cn.eppdev.jee.conf.service.auto._EppdevIndexService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevIndexService extends _EppdevIndexService {

    @Override
    public void customeInit(EppdevIndex entity) {
    }


    /**
     * list indexes by table id
     * @param tableId table id
     * @return all the indexes of the table
     */
    public List<EppdevIndex> listByTableId(String tableId){
        EppdevIndexParam param = new EppdevIndexParam();
        param.setTableId(tableId);
        return list(param).getList();
    }

}
