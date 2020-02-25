package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class UserLoginLog implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private String loginIp;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public UserLoginLog(Long id, Long userId, String userName, String loginIp, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.loginIp = loginIp;
        this.createTime = createTime;
    }

    public UserLoginLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}