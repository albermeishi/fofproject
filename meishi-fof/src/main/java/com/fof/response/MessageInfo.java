package com.fof.response;

import com.fof.enums.InfoCode;
import java.io.Serializable;

public class MessageInfo implements Serializable {
    private static final long serialVersionUID = 5209356010184544461L;

    /**
     * 返回状态码
     */
    private int code;
    /**
     * 返回数据
     */
    private Object data;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 总记录数
     */
    private int total;

    public MessageInfo() {
        this.code = InfoCode.SUCCESS.getCode();
        this.message = InfoCode.SUCCESS.getMessage();
    }
    public MessageInfo(InfoCode infoCode) {
        this.code = infoCode.getCode();
        this.message = infoCode.getMessage();
    }
    public MessageInfo(InfoCode infoCode, Object data) {
        this.code = infoCode.getCode();
        this.message = infoCode.getMessage();
        this.data = data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
