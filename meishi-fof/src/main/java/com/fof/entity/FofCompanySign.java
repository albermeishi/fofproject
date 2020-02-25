package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class FofCompanySign implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private Long fofCompanyId;

    private String companyName;

    private String socialCode;

    private String lawName;

    private Integer imprintType;

    private String imprintName;

    private String lawCard;

    private String lawMobile;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public FofCompanySign(Long id, Long userId, String userName, Long fofCompanyId, String companyName, String socialCode, String lawName, Integer imprintType, String imprintName, String lawCard, String lawMobile, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.fofCompanyId = fofCompanyId;
        this.companyName = companyName;
        this.socialCode = socialCode;
        this.lawName = lawName;
        this.imprintType = imprintType;
        this.imprintName = imprintName;
        this.lawCard = lawCard;
        this.lawMobile = lawMobile;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FofCompanySign() {
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

    public Long getFofCompanyId() {
        return fofCompanyId;
    }

    public void setFofCompanyId(Long fofCompanyId) {
        this.fofCompanyId = fofCompanyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getSocialCode() {
        return socialCode;
    }

    public void setSocialCode(String socialCode) {
        this.socialCode = socialCode == null ? null : socialCode.trim();
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName == null ? null : lawName.trim();
    }

    public Integer getImprintType() {
        return imprintType;
    }

    public void setImprintType(Integer imprintType) {
        this.imprintType = imprintType;
    }

    public String getImprintName() {
        return imprintName;
    }

    public void setImprintName(String imprintName) {
        this.imprintName = imprintName == null ? null : imprintName.trim();
    }

    public String getLawCard() {
        return lawCard;
    }

    public void setLawCard(String lawCard) {
        this.lawCard = lawCard == null ? null : lawCard.trim();
    }

    public String getLawMobile() {
        return lawMobile;
    }

    public void setLawMobile(String lawMobile) {
        this.lawMobile = lawMobile == null ? null : lawMobile.trim();
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