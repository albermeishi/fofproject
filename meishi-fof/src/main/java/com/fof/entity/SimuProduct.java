package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class SimuProduct implements Serializable {
    private Long id;

    private Long userId;

    private String simuCompanyName;

    private Long simuCompanyId;

    private String userName;

    private Long foreignSourceId;

    private Long sourceId;

    private Long tagId;

    private Integer productPCodeStatus;

    private String productCode;

    private String productName;

    private Integer boffinId;

    private Integer strategyType;

    private Integer productType;

    private String trustee;

    private String organization;

    private String organizationCode;

    private String operationWay;

    private String  frequency;

    private String productStartDate;

    private String productendDate;

    private Integer  poolStatus;

    private Integer enterStatus;

    private Integer enterTypeStatus;

    private Integer cooperationStatus;

    private Date enterTime;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public SimuProduct(Long id, Long userId, String simuCompanyName, Long simuCompanyId, String userName, Long foreignSourceId, Long sourceId, Long tagId, Integer productPCodeStatus, String productCode, String productName, Integer boffinId, Integer strategyType, Integer productType, String trustee, String organization, String organizationCode, String operationWay, String  frequency, String productStartDate, String productendDate, Integer  poolStatus, Integer enterStatus, Integer enterTypeStatus, Integer cooperationStatus, Date enterTime, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.simuCompanyName = simuCompanyName;
        this.simuCompanyId = simuCompanyId;
        this.userName = userName;
        this.foreignSourceId = foreignSourceId;
        this.sourceId = sourceId;
        this.tagId = tagId;
        this.productPCodeStatus = productPCodeStatus;
        this.productCode = productCode;
        this.productName = productName;
        this.boffinId = boffinId;
        this.strategyType = strategyType;
        this.productType = productType;
        this.trustee = trustee;
        this.organization = organization;
        this.organizationCode = organizationCode;
        this.operationWay = operationWay;
        this. frequency =  frequency;
        this.productStartDate = productStartDate;
        this.productendDate = productendDate;
        this. poolStatus =  poolStatus;
        this.enterStatus = enterStatus;
        this.enterTypeStatus = enterTypeStatus;
        this.cooperationStatus = cooperationStatus;
        this.enterTime = enterTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SimuProduct() {
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

    public String getSimuCompanyName() {
        return simuCompanyName;
    }

    public void setSimuCompanyName(String simuCompanyName) {
        this.simuCompanyName = simuCompanyName == null ? null : simuCompanyName.trim();
    }

    public Long getSimuCompanyId() {
        return simuCompanyId;
    }

    public void setSimuCompanyId(Long simuCompanyId) {
        this.simuCompanyId = simuCompanyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getForeignSourceId() {
        return foreignSourceId;
    }

    public void setForeignSourceId(Long foreignSourceId) {
        this.foreignSourceId = foreignSourceId;
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

    public Integer getProductPCodeStatus() {
        return productPCodeStatus;
    }

    public void setProductPCodeStatus(Integer productPCodeStatus) {
        this.productPCodeStatus = productPCodeStatus;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getBoffinId() {
        return boffinId;
    }

    public void setBoffinId(Integer boffinId) {
        this.boffinId = boffinId;
    }

    public Integer getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getTrustee() {
        return trustee;
    }

    public void setTrustee(String trustee) {
        this.trustee = trustee == null ? null : trustee.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getOperationWay() {
        return operationWay;
    }

    public void setOperationWay(String operationWay) {
        this.operationWay = operationWay == null ? null : operationWay.trim();
    }

    public String getfrequency() {
        return  frequency;
    }

    public void setfrequency(String  frequency) {
        this. frequency =  frequency == null ? null :  frequency.trim();
    }

    public String getProductStartDate() {
        return productStartDate;
    }

    public void setProductStartDate(String productStartDate) {
        this.productStartDate = productStartDate == null ? null : productStartDate.trim();
    }

    public String getProductendDate() {
        return productendDate;
    }

    public void setProductendDate(String productendDate) {
        this.productendDate = productendDate == null ? null : productendDate.trim();
    }

    public Integer getPoolStatus() {
        return  poolStatus;
    }

    public void setPoolStatus(Integer  poolStatus) {
        this. poolStatus =  poolStatus;
    }

    public Integer getEnterStatus() {
        return enterStatus;
    }

    public void setEnterStatus(Integer enterStatus) {
        this.enterStatus = enterStatus;
    }

    public Integer getEnterTypeStatus() {
        return enterTypeStatus;
    }

    public void setEnterTypeStatus(Integer enterTypeStatus) {
        this.enterTypeStatus = enterTypeStatus;
    }

    public Integer getCooperationStatus() {
        return cooperationStatus;
    }

    public void setCooperationStatus(Integer cooperationStatus) {
        this.cooperationStatus = cooperationStatus;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
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