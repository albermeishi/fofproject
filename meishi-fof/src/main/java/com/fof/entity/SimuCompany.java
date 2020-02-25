package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class SimuCompany implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private Long sourceId;

    private Long tagId;

    private Integer codeStatus;

    private String simuCompanyCode;

    private String simuCompanyName;

    private String registry;

    private String organizationType;

    private String registryMoney;

    private Integer conditionNumer;

    private Integer conditionOther;

    private Long boffinId;

    private String boffiName;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public SimuCompany(Long id, Long userId, String userName, Long sourceId, Long tagId, Integer codeStatus, String simuCompanyCode, String simuCompanyName, String registry, String organizationType, String registryMoney, Integer conditionNumer, Integer conditionOther, Long boffinId, String boffiName, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.sourceId = sourceId;
        this.tagId = tagId;
        this.codeStatus = codeStatus;
        this.simuCompanyCode = simuCompanyCode;
        this.simuCompanyName = simuCompanyName;
        this.registry = registry;
        this.organizationType = organizationType;
        this.registryMoney = registryMoney;
        this.conditionNumer = conditionNumer;
        this.conditionOther = conditionOther;
        this.boffinId = boffinId;
        this.boffiName = boffiName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SimuCompany() {
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

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Integer getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(Integer codeStatus) {
        this.codeStatus = codeStatus;
    }

    public String getSimuCompanyCode() {
        return simuCompanyCode;
    }

    public void setSimuCompanyCode(String simuCompanyCode) {
        this.simuCompanyCode = simuCompanyCode == null ? null : simuCompanyCode.trim();
    }

    public String getSimuCompanyName() {
        return simuCompanyName;
    }

    public void setSimuCompanyName(String simuCompanyName) {
        this.simuCompanyName = simuCompanyName == null ? null : simuCompanyName.trim();
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry == null ? null : registry.trim();
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType == null ? null : organizationType.trim();
    }

    public String getRegistryMoney() {
        return registryMoney;
    }

    public void setRegistryMoney(String registryMoney) {
        this.registryMoney = registryMoney == null ? null : registryMoney.trim();
    }

    public Integer getConditionNumer() {
        return conditionNumer;
    }

    public void setConditionNumer(Integer conditionNumer) {
        this.conditionNumer = conditionNumer;
    }

    public Integer getConditionOther() {
        return conditionOther;
    }

    public void setConditionOther(Integer conditionOther) {
        this.conditionOther = conditionOther;
    }

    public Long getBoffinId() {
        return boffinId;
    }

    public void setBoffinId(Long boffinId) {
        this.boffinId = boffinId;
    }

    public String getBoffiName() {
        return boffiName;
    }

    public void setBoffiName(String boffiName) {
        this.boffiName = boffiName == null ? null : boffiName.trim();
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