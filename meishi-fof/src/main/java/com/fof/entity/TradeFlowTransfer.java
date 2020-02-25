package com.fof.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeFlowTransfer implements Serializable {
    private Long id;

    private Long tradeflowId;

    private Date createTime;

    private Date updateTime;

    private Long operateUserId;

    private String operateUserName;

    private BigDecimal transferTradeMoney;

    private String transferTradeMoneyUpper;

    private Integer noticeType;

    private Date transferTime;

    private static final long serialVersionUID = 1L;

    public TradeFlowTransfer(Long id, Long tradeflowId, Date createTime, Date updateTime, Long operateUserId, String operateUserName, BigDecimal transferTradeMoney, String transferTradeMoneyUpper, Integer noticeType, Date transferTime) {
        this.id = id;
        this.tradeflowId = tradeflowId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.operateUserId = operateUserId;
        this.operateUserName = operateUserName;
        this.transferTradeMoney = transferTradeMoney;
        this.transferTradeMoneyUpper = transferTradeMoneyUpper;
        this.noticeType = noticeType;
        this.transferTime = transferTime;
    }

    public TradeFlowTransfer() {
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

    public BigDecimal getTransferTradeMoney() {
        return transferTradeMoney;
    }

    public void setTransferTradeMoney(BigDecimal transferTradeMoney) {
        this.transferTradeMoney = transferTradeMoney;
    }

    public String getTransferTradeMoneyUpper() {
        return transferTradeMoneyUpper;
    }

    public void setTransferTradeMoneyUpper(String transferTradeMoneyUpper) {
        this.transferTradeMoneyUpper = transferTradeMoneyUpper == null ? null : transferTradeMoneyUpper.trim();
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }
}