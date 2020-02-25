package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class FofCompany implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private String companyName;

    private String certificateType;

    private String certificateTypeCode;

    private String certificateTypeValidity;

    private String licenses;

    private String licensesCode;

    private String businessScope;

    private String registerAddress;

    private String address;

    private String registerMoney;

    private String shareHolder;

    private String accountName;

    private String accountNumber;

    private String bankName;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public FofCompany(Long id, Long userId, String userName, String companyName, String certificateType, String certificateTypeCode, String certificateTypeValidity, String licenses, String licensesCode, String businessScope, String registerAddress, String address, String registerMoney, String shareHolder, String accountName, String accountNumber, String bankName, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.companyName = companyName;
        this.certificateType = certificateType;
        this.certificateTypeCode = certificateTypeCode;
        this.certificateTypeValidity = certificateTypeValidity;
        this.licenses = licenses;
        this.licensesCode = licensesCode;
        this.businessScope = businessScope;
        this.registerAddress = registerAddress;
        this.address = address;
        this.registerMoney = registerMoney;
        this.shareHolder = shareHolder;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FofCompany() {
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getCertificateTypeCode() {
        return certificateTypeCode;
    }

    public void setCertificateTypeCode(String certificateTypeCode) {
        this.certificateTypeCode = certificateTypeCode == null ? null : certificateTypeCode.trim();
    }

    public String getCertificateTypeValidity() {
        return certificateTypeValidity;
    }

    public void setCertificateTypeValidity(String certificateTypeValidity) {
        this.certificateTypeValidity = certificateTypeValidity == null ? null : certificateTypeValidity.trim();
    }

    public String getLicenses() {
        return licenses;
    }

    public void setLicenses(String licenses) {
        this.licenses = licenses == null ? null : licenses.trim();
    }

    public String getLicensesCode() {
        return licensesCode;
    }

    public void setLicensesCode(String licensesCode) {
        this.licensesCode = licensesCode == null ? null : licensesCode.trim();
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRegisterMoney() {
        return registerMoney;
    }

    public void setRegisterMoney(String registerMoney) {
        this.registerMoney = registerMoney == null ? null : registerMoney.trim();
    }

    public String getShareHolder() {
        return shareHolder;
    }

    public void setShareHolder(String shareHolder) {
        this.shareHolder = shareHolder == null ? null : shareHolder.trim();
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