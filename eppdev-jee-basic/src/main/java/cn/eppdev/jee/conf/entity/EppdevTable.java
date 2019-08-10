/* FileName: EppdevTable.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevTable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class EppdevTable extends _EppdevTable{
    private List<EppdevColumn> columnList;
    private List<EppdevIndex> indexList;
    private List<EppdevTableLog> logList;
    private EppdevVersion version;
    private Map<String, String> basicConf;

    public List<EppdevColumn> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<EppdevColumn> columnList) {
        this.columnList = columnList;
    }

    public List<EppdevIndex> getIndexList() {
        return indexList;
    }

    public void setIndexList(List<EppdevIndex> indexList) {
        this.indexList = indexList;
    }

    public EppdevVersion getVersion() {
        return version;
    }

    public void setVersion(EppdevVersion version) {
        this.version = version;
    }

    public Map<String, String> getBasicConf() {
        return basicConf;
    }

    public void setBasicConf(Map<String, String> basicConf) {
        this.basicConf = basicConf;
    }

    public List<EppdevTableLog> getLogList() {
        return logList;
    }

    public void setLogList(List<EppdevTableLog> logList) {
        this.logList = logList;
    }

    @JsonIgnore
    public List<EppdevColumn> getPrimaryKeyList(){
        List<EppdevColumn> list = new ArrayList<>();
        for (EppdevColumn column: columnList) {
            if (column.getPrimaryKeyFlag() == 1) {
                list.add(column);
            }
        }
        return list;
    }

    @JsonIgnore
    public List<EppdevColumn> getLogicKeyList(){
        List<EppdevColumn> list = new ArrayList<>();
        for (EppdevColumn column: columnList) {
            if (column.getLogicKeyFlag() == 1) {
                list.add(column);
            }
        }
        return list;
    }
}
