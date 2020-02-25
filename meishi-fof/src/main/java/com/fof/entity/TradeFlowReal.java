package com.fof.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeFlowReal implements Serializable {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private Long operateUserId;

    private String operateName;

    private BigDecimal realTradeMoney;

    private BigDecimal realTradeNetValue;

    private BigDecimal realTradeShare;

    private Integer colorType;

    private Integer showWebStatus;

    private Integer showNetValueStatus;

    private String remark;

    private Date realDate;

    private static final long serialVersionUID = 1L;

    public TradeFlowReal(Long id, Date createTime, Date updateTime, Long operateUserId, String operateName, BigDecimal realTradeMoney, BigDecimal realTradeNetValue, BigDecimal realTradeShare, Integer colorType, Integer showWebStatus, Integer showNetValueStatus, String remark, Date realDate) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.operateUserId = operateUserId;
        this.operateName = operateName;
        this.realTradeMoney = realTradeMoney;
        this.realTradeNetValue = realTradeNetValue;
        this.realTradeShare = realTradeShare;
        this.colorType = colorType;
        this.showWebStatus = showWebStatus;
        this.showNetValueStatus = showNetValueStatus;
        this.remark = remark;
        this.realDate = realDate;
    }

    public TradeFlowReal() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public BigDecimal getRealTradeMoney() {
        return realTradeMoney;
    }

    public void setRealTradeMoney(BigDecimal realTradeMoney) {
        this.realTradeMoney = realTradeMoney;
    }

    public BigDecimal getRealTradeNetValue() {
        return realTradeNetValue;
    }

    public void setRealTradeNetValue(BigDecimal realTradeNetValue) {
        this.realTradeNetValue = realTradeNetValue;
    }

    public BigDecimal getRealTradeShare() {
        return realTradeShare;
    }

    public void setRealTradeShare(BigDecimal realTradeShare) {
        this.realTradeShare = realTradeShare;
    }

    public Integer getColorType() {
        return colorType;
    }

    public void setColorType(Integer colorType) {
        this.colorType = colorType;
    }

    public Integer getShowWebStatus() {
        return showWebStatus;
    }

    public void setShowWebStatus(Integer showWebStatus) {
        this.showWebStatus = showWebStatus;
    }

    public Integer getShowNetValueStatus() {
        return showNetValueStatus;
    }

    public void setShowNetValueStatus(Integer showNetValueStatus) {
        this.showNetValueStatus = showNetValueStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getRealDate() {
        return realDate;
    }

    public void setRealDate(Date realDate) {
        this.realDate = realDate;
    }
}