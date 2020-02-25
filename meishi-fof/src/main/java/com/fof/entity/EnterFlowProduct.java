package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class EnterFlowProduct implements Serializable {
    private Long id;

    private Long tagId;

    private Long enterFlowId;

    private String productName;

    private Integer stopStatus;

    private Date foundDate;

    private Date prouctEndDate;

    private String strategy;

    private String rate;

    private String trusteeAgency;

    private String valuationAgency;

    private String capitalProperty;

    private String periodMaximum;

    private String periodMinmum;

    private Integer performanceDataStatus;

    private Date perfomanceDataStartDate;

    private Date perfomanceDataStartEndDate;

    private String riskFree;

    private Integer newShareStatus;

    private Integer shareFofStatus;

    private Integer shareDataStatus;

    private Date shareStartDate;

    private Date shareEndDate;

    private static final long serialVersionUID = 1L;

    public EnterFlowProduct(Long id, Long tagId, Long enterFlowId, String productName, Integer stopStatus, Date foundDate, Date prouctEndDate, String strategy, String rate, String trusteeAgency, String valuationAgency, String capitalProperty, String periodMaximum, String periodMinmum, Integer performanceDataStatus, Date perfomanceDataStartDate, Date perfomanceDataStartEndDate, String riskFree, Integer newShareStatus, Integer shareFofStatus, Integer shareDataStatus, Date shareStartDate, Date shareEndDate) {
        this.id = id;
        this.tagId = tagId;
        this.enterFlowId = enterFlowId;
        this.productName = productName;
        this.stopStatus = stopStatus;
        this.foundDate = foundDate;
        this.prouctEndDate = prouctEndDate;
        this.strategy = strategy;
        this.rate = rate;
        this.trusteeAgency = trusteeAgency;
        this.valuationAgency = valuationAgency;
        this.capitalProperty = capitalProperty;
        this.periodMaximum = periodMaximum;
        this.periodMinmum = periodMinmum;
        this.performanceDataStatus = performanceDataStatus;
        this.perfomanceDataStartDate = perfomanceDataStartDate;
        this.perfomanceDataStartEndDate = perfomanceDataStartEndDate;
        this.riskFree = riskFree;
        this.newShareStatus = newShareStatus;
        this.shareFofStatus = shareFofStatus;
        this.shareDataStatus = shareDataStatus;
        this.shareStartDate = shareStartDate;
        this.shareEndDate = shareEndDate;
    }

    public EnterFlowProduct() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getEnterFlowId() {
        return enterFlowId;
    }

    public void setEnterFlowId(Long enterFlowId) {
        this.enterFlowId = enterFlowId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getStopStatus() {
        return stopStatus;
    }

    public void setStopStatus(Integer stopStatus) {
        this.stopStatus = stopStatus;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public Date getProuctEndDate() {
        return prouctEndDate;
    }

    public void setProuctEndDate(Date prouctEndDate) {
        this.prouctEndDate = prouctEndDate;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy == null ? null : strategy.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getTrusteeAgency() {
        return trusteeAgency;
    }

    public void setTrusteeAgency(String trusteeAgency) {
        this.trusteeAgency = trusteeAgency == null ? null : trusteeAgency.trim();
    }

    public String getValuationAgency() {
        return valuationAgency;
    }

    public void setValuationAgency(String valuationAgency) {
        this.valuationAgency = valuationAgency == null ? null : valuationAgency.trim();
    }

    public String getCapitalProperty() {
        return capitalProperty;
    }

    public void setCapitalProperty(String capitalProperty) {
        this.capitalProperty = capitalProperty == null ? null : capitalProperty.trim();
    }

    public String getPeriodMaximum() {
        return periodMaximum;
    }

    public void setPeriodMaximum(String periodMaximum) {
        this.periodMaximum = periodMaximum == null ? null : periodMaximum.trim();
    }

    public String getPeriodMinmum() {
        return periodMinmum;
    }

    public void setPeriodMinmum(String periodMinmum) {
        this.periodMinmum = periodMinmum == null ? null : periodMinmum.trim();
    }

    public Integer getPerformanceDataStatus() {
        return performanceDataStatus;
    }

    public void setPerformanceDataStatus(Integer performanceDataStatus) {
        this.performanceDataStatus = performanceDataStatus;
    }

    public Date getPerfomanceDataStartDate() {
        return perfomanceDataStartDate;
    }

    public void setPerfomanceDataStartDate(Date perfomanceDataStartDate) {
        this.perfomanceDataStartDate = perfomanceDataStartDate;
    }

    public Date getPerfomanceDataStartEndDate() {
        return perfomanceDataStartEndDate;
    }

    public void setPerfomanceDataStartEndDate(Date perfomanceDataStartEndDate) {
        this.perfomanceDataStartEndDate = perfomanceDataStartEndDate;
    }

    public String getRiskFree() {
        return riskFree;
    }

    public void setRiskFree(String riskFree) {
        this.riskFree = riskFree == null ? null : riskFree.trim();
    }

    public Integer getNewShareStatus() {
        return newShareStatus;
    }

    public void setNewShareStatus(Integer newShareStatus) {
        this.newShareStatus = newShareStatus;
    }

    public Integer getShareFofStatus() {
        return shareFofStatus;
    }

    public void setShareFofStatus(Integer shareFofStatus) {
        this.shareFofStatus = shareFofStatus;
    }

    public Integer getShareDataStatus() {
        return shareDataStatus;
    }

    public void setShareDataStatus(Integer shareDataStatus) {
        this.shareDataStatus = shareDataStatus;
    }

    public Date getShareStartDate() {
        return shareStartDate;
    }

    public void setShareStartDate(Date shareStartDate) {
        this.shareStartDate = shareStartDate;
    }

    public Date getShareEndDate() {
        return shareEndDate;
    }

    public void setShareEndDate(Date shareEndDate) {
        this.shareEndDate = shareEndDate;
    }
}