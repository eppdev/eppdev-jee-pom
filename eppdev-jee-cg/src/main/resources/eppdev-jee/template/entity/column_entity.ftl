/* FileName: ColumnEntity.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.entity;

import ${BASIC_PACKAGE_NAME}.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class ColumnEntity {
    static Logger logger = LoggerFactory.getLogger(ColumnEntity.class);

    private String columnName;
    private String propertyName;

    public ColumnEntity(String columnName, String propertyName) {
        this.columnName = columnName;
        this.propertyName = propertyName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
