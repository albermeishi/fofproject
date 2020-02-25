package com.fof.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Trade implements Serializable {
    private Long id;

    private Long simuCompanyId;

    private String simuCompanyName;

    private Long simuProductId;

    private String simuProductName;

    private Long fofCompanyId;

    private String fofCompanyName;

    private Long fofProductId;

    private String fofProductName;

    private Date createTime;

    private Date updateTime;

    private BigDecimal totalTradeMoney;

    private BigDecimal totalShare;

    private static final long serialVersionUID = 1L;

    public Trade(Long id, Long simuCompanyId, String simuCompanyName, Long simuProductId, String simuProductName, Long fofCompanyId, String fofCompanyName, Long fofProductId, String fofProductName, Date createTime, Date updateTime, BigDecimal totalTradeMoney, BigDecimal totalShare) {
        this.id = id;
        this.simuCompanyId = simuCompanyId;
        this.simuCompanyName = simuCompanyName;
        this.simuProductId = simuProductId;
        this.simuProductName = simuProductName;
        this.fofCompanyId = fofCompanyId;
        this.fofCompanyName = fofCompanyName;
        this.fofProductId = fofProductId;
        this.fofProductName = fofProductName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.totalTradeMoney = totalTradeMoney;
        this.totalShare = totalShare;
    }

    public Trade() {
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

    public BigDecimal getTotalTradeMoney() {
        return totalTradeMoney;
    }

    public void setTotalTradeMoney(BigDecimal totalTradeMoney) {
        this.totalTradeMoney = totalTradeMoney;
    }

    public BigDecimal getTotalShare() {
        return totalShare;
    }

    public void setTotalShare(BigDecimal totalShare) {
        this.totalShare = totalShare;
    }
}