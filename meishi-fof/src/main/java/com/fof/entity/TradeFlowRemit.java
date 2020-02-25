package com.fof.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeFlowRemit implements Serializable {
    private Long id;

    private Long tradeflowId;

    private Date createTime;

    private Date updateTime;

    private Long operateUserId;

    private String operateUserName;

    private BigDecimal remitTradeMoney;

    private String remitTradeMoneyUpper;

    private String accountName;

    private String accountNumber;

    private String bankName;

    private static final long serialVersionUID = 1L;

    public TradeFlowRemit(Long id, Long tradeflowId, Date createTime, Date updateTime, Long operateUserId, String operateUserName, BigDecimal remitTradeMoney, String remitTradeMoneyUpper, String accountName, String accountNumber, String bankName) {
        this.id = id;
        this.tradeflowId = tradeflowId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.operateUserId = operateUserId;
        this.operateUserName = operateUserName;
        this.remitTradeMoney = remitTradeMoney;
        this.remitTradeMoneyUpper = remitTradeMoneyUpper;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    public TradeFlowRemit() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTradeflowId() {
        return tradeflowId;
    }

    public void setTradeflowId(Long tradeflowId) {
        this.tradeflowId = tradeflowId;
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

    public Long getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(Long operateUserId) {
        this.operateUserId = operateUserId;
    }

    public String getOperateUserName() {
        return operateUserName;
    }

    public void setOperateUserName(String operateUserName) {
        this.operateUserName = operateUserName == null ? null : operateUserName.trim();
    }

    public BigDecimal getRemitTradeMoney() {
        return remitTradeMoney;
    }

    public void setRemitTradeMoney(BigDecimal remitTradeMoney) {
        this.remitTradeMoney = remitTradeMoney;
    }

    public String getRemitTradeMoneyUpper() {
        return remitTradeMoneyUpper;
    }

    public void setRemitTradeMoneyUpper(String remitTradeMoneyUpper) {
        this.remitTradeMoneyUpper = remitTradeMoneyUpper == null ? null : remitTradeMoneyUpper.trim();
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
}