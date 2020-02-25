package com.fof.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeFlow implements Serializable {
    private Long id;

    private Long simuCompanyId;

    private String simuCompanyName;

    private Long simuProductId;

    private String simuProductName;

    private Long fofCompanyId;

    private String fofCompanyName;

    private Long fofProductId;

    private String fofProductName;

    private Long fofOperatorId;

    private String fofOperatorName;

    private Long boffinId;

    private String boffinIdName;

    private Date createTime;

    private Date updateTime;

    private Long tradeUserId;

    private String tradeUserName;

    private BigDecimal tradeMoney;

    private String tradeMoneyUpper;

    private BigDecimal tradeShare;

    private Integer tradeOnine;

    private Integer tradeType;

    private Integer tradeStatus;

    private Integer currentFlowCode;

    private String curentFlowCodeText;

    private String accountName;

    private String accountNumber;

    private String bankName;

    private Integer ransomType;

    private String trafficNumber;

    private static final long serialVersionUID = 1L;

    public TradeFlow(Long id, Long simuCompanyId, String simuCompanyName, Long simuProductId, String simuProductName, Long fofCompanyId, String fofCompanyName, Long fofProductId, String fofProductName, Long fofOperatorId, String fofOperatorName, Long boffinId, String boffinIdName, Date createTime, Date updateTime, Long tradeUserId, String tradeUserName, BigDecimal tradeMoney, String tradeMoneyUpper, BigDecimal tradeShare, Integer tradeOnine, Integer tradeType, Integer tradeStatus, Integer currentFlowCode, String curentFlowCodeText, String accountName, String accountNumber, String bankName, Integer ransomType, String trafficNumber) {
        this.id = id;
        this.simuCompanyId = simuCompanyId;
        this.simuCompanyName = simuCompanyName;
        this.simuProductId = simuProductId;
        this.simuProductName = simuProductName;
        this.fofCompanyId = fofCompanyId;
        this.fofCompanyName = fofCompanyName;
        this.fofProductId = fofProductId;
        this.fofProductName = fofProductName;
        this.fofOperatorId = fofOperatorId;
        this.fofOperatorName = fofOperatorName;
        this.boffinId = boffinId;
        this.boffinIdName = boffinIdName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.tradeUserId = tradeUserId;
        this.tradeUserName = tradeUserName;
        this.tradeMoney = tradeMoney;
        this.tradeMoneyUpper = tradeMoneyUpper;
        this.tradeShare = tradeShare;
        this.tradeOnine = tradeOnine;
        this.tradeType = tradeType;
        this.tradeStatus = tradeStatus;
        this.currentFlowCode = currentFlowCode;
        this.curentFlowCodeText = curentFlowCodeText;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.ransomType = ransomType;
        this.trafficNumber = trafficNumber;
    }

    public TradeFlow() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSimuCompanyId() {
        return simuCompanyId;
    }

    public void setSimuCompanyId(Long simuCompanyId) {
        this.simuCompanyId = simuCompanyId;
    }

    public String getSimuCompanyName() {
        return simuCompanyName;
    }

    public void setSimuCompanyName(String simuCompanyName) {
        this.simuCompanyName = simuCompanyName == null ? null : simuCompanyName.trim();
    }

    public Long getSimuProductId() {
        return simuProductId;
    }

    public void setSimuProductId(Long simuProductId) {
        this.simuProductId = simuProductId;
    }

    public String getSimuProductName() {
        return simuProductName;
    }

    public void setSimuProductName(String simuProductName) {
        this.simuProductName = simuProductName == null ? null : simuProductName.trim();
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

    public Long getFofProductId() {
        return fofProductId;
    }

    public void setFofProductId(Long fofProductId) {
        this.fofProductId = fofProductId;
    }

    public String getFofProductName() {
        return fofProductName;
    }

    public void setFofProductName(String fofProductName) {
        this.fofProductName = fofProductName == null ? null : fofProductName.trim();
    }

    public Long getFofOperatorId() {
        return fofOperatorId;
    }

    public void setFofOperatorId(Long fofOperatorId) {
        this.fofOperatorId = fofOperatorId;
    }

    public String getFofOperatorName() {
        return fofOperatorName;
    }

    public void setFofOperatorName(String fofOperatorName) {
        this.fofOperatorName = fofOperatorName == null ? null : fofOperatorName.trim();
    }

    public Long getBoffinId() {
        return boffinId;
    }

    public void setBoffinId(Long boffinId) {
        this.boffinId = boffinId;
    }

    public String getBoffinIdName() {
        return boffinIdName;
    }

    public void setBoffinIdName(String boffinIdName) {
        this.boffinIdName = boffinIdName == null ? null : boffinIdName.trim();
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

    public Long getTradeUserId() {
        return tradeUserId;
    }

    public void setTradeUserId(Long tradeUserId) {
        this.tradeUserId = tradeUserId;
    }

    public String getTradeUserName() {
        return tradeUserName;
    }

    public void setTradeUserName(String tradeUserName) {
        this.tradeUserName = tradeUserName == null ? null : tradeUserName.trim();
    }

    public BigDecimal getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(BigDecimal tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public String getTradeMoneyUpper() {
        return tradeMoneyUpper;
    }

    public void setTradeMoneyUpper(String tradeMoneyUpper) {
        this.tradeMoneyUpper = tradeMoneyUpper == null ? null : tradeMoneyUpper.trim();
    }

    public BigDecimal getTradeShare() {
        return tradeShare;
    }

    public void setTradeShare(BigDecimal tradeShare) {
        this.tradeShare = tradeShare;
    }

    public Integer getTradeOnine() {
        return tradeOnine;
    }

    public void setTradeOnine(Integer tradeOnine) {
        this.tradeOnine = tradeOnine;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Integer getCurrentFlowCode() {
        return currentFlowCode;
    }

    public void setCurrentFlowCode(Integer currentFlowCode) {
        this.currentFlowCode = currentFlowCode;
    }

    public String getCurentFlowCodeText() {
        return curentFlowCodeText;
    }

    public void setCurentFlowCodeText(String curentFlowCodeText) {
        this.curentFlowCodeText = curentFlowCodeText == null ? null : curentFlowCodeText.trim();
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

    public Integer getRansomType() {
        return ransomType;
    }

    public void setRansomType(Integer ransomType) {
        this.ransomType = ransomType;
    }

    public String getTrafficNumber() {
        return trafficNumber;
    }

    public void setTrafficNumber(String trafficNumber) {
        this.trafficNumber = trafficNumber == null ? null : trafficNumber.trim();
    }
}