/* FileName: TableLogService.java
 * Copyright EPPDEV.CN(jinlong.hao@eppdev.cn)  All Rights Preserved!
 * Licensed By ANTI-996 License V1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevTableLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class TableLogService {
    static Logger logger = LoggerFactory.getLogger(TableLogService.class);

    @Autowired
    EppdevTableLogService eppdevTableLogService;

    @Autowired
    EppdevConfService eppdevConfService;

    public int addLog(String tableId, String operType, String operContent) {
        String authorName = eppdevConfService.getConf("AUTHOR_NAME");
        List<EppdevTableLog> list = eppdevTableLogService.listByTableId(tableId);
        // 24小时之内同一个人的操作，直接合并
        if (list.size() > 0 && authorName.equals(list.get(0).getAuthorName())
                &&  System.currentTimeMillis() - list.get(0).getCreateDate().getTime() < 1000L*60*24) {
            EppdevTableLog eppdevTableLog  = list.get(0);
            eppdevTableLog.setOperContent(eppdevTableLog.getOperContent() + "\n" + operContent);
            eppdevTableLogService.save(eppdevTableLog);
        } else {
            EppdevTableLog eppdevTableLog = new EppdevTableLog();
            eppdevTableLog.setTableId(tableId);
            eppdevTableLog.setAuthorName(authorName);
            eppdevTableLog.setOperType(operType);
            eppdevTableLog.setOperContent(operContent);
            eppdevTableLogService.save(eppdevTableLog);
        }
        return 1;
    }
}
