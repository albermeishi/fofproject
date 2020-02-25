package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class FofProduct implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private Long fofCompanyId;

    private String fofCompanyName;

    private String productCode;

    private String productName;

    private String productType;

    private String organization;

    private Date fundDate;

    private Date  registerDate;


    private String validity;

    private String productCatalog;

    private String productScale;

    private String productManageName;

    private String productCounselor;

    private String trustee;

    private String outsourcing;

    private String accountName;

    private String accountNumber;

    private String bankName;

    private Integer riskLevel;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public FofProduct(Long id, Long userId, String userName, Long fofCompanyId, String fofCompanyName, String productCode, String productName, String productType, String organization, Date fundDate, Date 
registerDate, String validity, String productCatalog, String productScale, String productManageName, String productCounselor, String trustee, String outsourcing, String accountName, String accountNumber, String bankName, Integer riskLevel, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.fofCompanyId = fofCompanyId;
        this.fofCompanyName = fofCompanyName;
        this.productCode = productCode;
        this.productName = productName;
        this.productType = productType;
        this.organization = organization;
        this.fundDate = fundDate;
        this.
registerDate = 
registerDate;
        this.validity = validity;
        this.productCatalog = productCatalog;
        this.productScale = productScale;
        this.productManageName = productManageName;
        this.productCounselor = productCounselor;
        this.trustee = trustee;
        this.outsourcing = outsourcing;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.riskLevel = riskLevel;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FofProduct() {
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

    public String getFofCompanyName() {
        return fofCompanyName;
    }

    public void setFofCompanyName(String fofCompanyName) {
        this.fofCompanyName = fofCompanyName == null ? null : fofCompanyName.trim();
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public Date getFundDate() {
        return fundDate;
    }

    public void setFundDate(Date fundDate) {
        this.fundDate = fundDate;
    }

    public Date getRegisterDate() {
        return  registerDate;
    }

    public void setRegisterDate(Date  registerDate) {
        this.
     registerDate =registerDate;

    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity == null ? null : validity.trim();
    }

    public String getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(String productCatalog) {
        this.productCatalog = productCatalog == null ? null : productCatalog.trim();
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale == null ? null : productScale.trim();
    }

    public String getProductManageName() {
        return productManageName;
    }

    public void setProductManageName(String productManageName) {
        this.productManageName = productManageName == null ? null : productManageName.trim();
    }

    public String getProductCounselor() {
        return productCounselor;
    }

    public void setProductCounselor(String productCounselor) {
        this.productCounselor = productCounselor == null ? null : productCounselor.trim();
    }

    public String getTrustee() {
        return trustee;
    }

    public void setTrustee(String trustee) {
        this.trustee = trustee == null ? null : trustee.trim();
    }

    public String getOutsourcing() {
        return outsourcing;
    }

    public void setOutsourcing(String outsourcing) {
        this.outsourcing = outsourcing == null ? null : outsourcing.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
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