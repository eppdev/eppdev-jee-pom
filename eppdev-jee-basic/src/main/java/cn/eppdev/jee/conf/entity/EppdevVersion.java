/* FileName: EppdevVersion.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevVersion;

import java.util.List;

/**
 * @author jinlong.hao
 */
public class EppdevVersion extends _EppdevVersion{
    public static String MASTER_VERSION_ID = "00000000000000000000000000000000";

    private String fromVersionId;

    private List<EppdevTable> tableList;

    public String getFromVersionId() {
        return fromVersionId;
    }

    public void setFromVersionId(String fromVersionId) {
        this.fromVersionId = fromVersionId;
    }

    public List<EppdevTable> getTableList() {
        return tableList;
    }

    public void setTableList(List<EppdevTable> tableList) {
        this.tableList = tableList;
    }
}
