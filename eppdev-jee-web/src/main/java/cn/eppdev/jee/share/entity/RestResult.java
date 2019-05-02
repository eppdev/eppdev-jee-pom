/* FileName: RestResult.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.share.entity;

import cn.eppdev.jee.utils.JSONUtils;

/**
 * @author jinlong.hao
 */
public class RestResult<T> {
    public static int STATUS_SUCCESS = 2000;
    public static int STATUS_FAILED = 2001;
    private int status;
    private String message;
    private T data;

    public RestResult(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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
