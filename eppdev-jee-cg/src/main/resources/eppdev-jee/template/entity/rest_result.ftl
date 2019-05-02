/* FileName: RestResult.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.entity;

import ${BASIC_PACKAGE_NAME}.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ${AUTHOR_NAME}
 */
public class RestResult <T> {
    static Logger logger = LoggerFactory.getLogger(RestResult.class);

    public static final int STATUS_SUCCESS = 2000;
    public static final int STATUS_FAILED = 2001;

    public Integer status;

    public String message;

    public T data;

    public RestResult(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }

}
