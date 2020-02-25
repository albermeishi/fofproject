package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class TradeFlowImpress implements Serializable {
    private Long id;

    private Long tradeflowId;

    private Date createTime;

    private Date updateTime;

    private Long operateUserId;

    private String operateUserName;

    private String fileName;

    private Integer fileCode;

    private Long attachmentId;

    private Integer cachetStatus;

    private Integer personalSealStatus;

    private Integer opreaterSealStatus;

    private static final long serialVersionUID = 1L;

    public TradeFlowImpress(Long id, Long tradeflowId, Date createTime, Date updateTime, Long operateUserId, String operateUserName, String fileName, Integer fileCode, Long attachmentId, Integer cachetStatus, Integer personalSealStatus, Integer opreaterSealStatus) {
        this.id = id;
        this.tradeflowId = tradeflowId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.operateUserId = operateUserId;
        this.operateUserName = operateUserName;
        this.fileName = fileName;
        this.fileCode = fileCode;
        this.attachmentId = attachmentId;
        this.cachetStatus = cachetStatus;
        this.personalSealStatus = personalSealStatus;
        this.opreaterSealStatus = opreaterSealStatus;
    }

    public TradeFlowImpress() {
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getFileCode() {
        return fileCode;
    }

    public void setFileCode(Integer fileCode) {
        this.fileCode = fileCode;
    }

    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Integer getCachetStatus() {
        return cachetStatus;
    }

    public void setCachetStatus(Integer cachetStatus) {
        this.cachetStatus = cachetStatus;
    }

    public Integer getPersonalSealStatus() {
        return personalSealStatus;
    }

    public void setPersonalSealStatus(Integer personalSealStatus) {
        this.personalSealStatus = personalSealStatus;
    }

    public Integer getOpreaterSealStatus() {
        return opreaterSealStatus;
    }

    public void setOpreaterSealStatus(Integer opreaterSealStatus) {
        this.opreaterSealStatus = opreaterSealStatus;
    }
}