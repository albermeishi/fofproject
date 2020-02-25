package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class UserSign implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private String fullName;

    private Integer cardType;

    private String cardNumber;

    private String bankNumber;

    private String bankMobile;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public UserSign(Long id, Long userId, String userName, String fullName, Integer cardType, String cardNumber, String bankNumber, String bankMobile, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.fullName = fullName;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
        this.bankMobile = bankMobile;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public UserSign() {
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber == null ? null : bankNumber.trim();
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile == null ? null : bankMobile.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}