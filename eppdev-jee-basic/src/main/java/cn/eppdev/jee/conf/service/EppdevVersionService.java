/* FileName: EppdevVersionService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.service.auto._EppdevVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevVersionService extends _EppdevVersionService {

    @Autowired
    EppdevTableService tableService;

    @Override
    public void customeInit(EppdevVersion entity) {
    }

    public EppdevVersion get(String id) {
        EppdevVersion version = super.get(id);
        if (version != null) {
            version.setTableList(tableService.listByVersionId(id));
        }
        return version;
    }
}
