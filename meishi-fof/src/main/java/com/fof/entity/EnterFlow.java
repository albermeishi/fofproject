package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class EnterFlow implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private Long simuCompanyId;

    private String simuCompanyName;

    private Integer simuCodeStatus;

    private Long simuProductId;

    private Integer simuProductCodeStatus;

    private String simuProductName;

    private Integer enterStatus;

    private Integer enterTypeStatus;

    private Integer enterType;

    private Integer currentFlowCode;

    private String curentFlowCodeText;

    private Long fofOperatorId;

    private String fofOperatorName;

    private Long boffinId;

    private String boffinIdName;

    private Long simuOperatorId;

    private String simuOperatorName;

    private Date simuOperatorTime;

    private Date createTime;

    private Date updateTime;

    private Integer riskResult;

    private static final long serialVersionUID = 1L;

    public EnterFlow(Long id, Long userId, String userName, Long simuCompanyId, String simuCompanyName, Integer simuCodeStatus, Long simuProductId, Integer simuProductCodeStatus, String simuProductName, Integer enterStatus, Integer enterTypeStatus, Integer enterType, Integer currentFlowCode, String curentFlowCodeText, Long fofOperatorId, String fofOperatorName, Long boffinId, String boffinIdName, Long simuOperatorId, String simuOperatorName, Date simuOperatorTime, Date createTime, Date updateTime, Integer riskResult) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.simuCompanyId = simuCompanyId;
        this.simuCompanyName = simuCompanyName;
        this.simuCodeStatus = simuCodeStatus;
        this.simuProductId = simuProductId;
        this.simuProductCodeStatus = simuProductCodeStatus;
        this.simuProductName = simuProductName;
        this.enterStatus = enterStatus;
        this.enterTypeStatus = enterTypeStatus;
        this.enterType = enterType;
        this.currentFlowCode = currentFlowCode;
        this.curentFlowCodeText = curentFlowCodeText;
        this.fofOperatorId = fofOperatorId;
        this.fofOperatorName = fofOperatorName;
        this.boffinId = boffinId;
        this.boffinIdName = boffinIdName;
        this.simuOperatorId = simuOperatorId;
        this.simuOperatorName = simuOperatorName;
        this.simuOperatorTime = simuOperatorTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.riskResult = riskResult;
    }

    public EnterFlow() {
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

    public Integer getSimuCodeStatus() {
        return simuCodeStatus;
    }

    public void setSimuCodeStatus(Integer simuCodeStatus) {
        this.simuCodeStatus = simuCodeStatus;
    }

    public Long getSimuProductId() {
        return simuProductId;
    }

    public void setSimuProductId(Long simuProductId) {
        this.simuProductId = simuProductId;
    }

    public Integer getSimuProductCodeStatus() {
        return simuProductCodeStatus;
    }

    public void setSimuProductCodeStatus(Integer simuProductCodeStatus) {
        this.simuProductCodeStatus = simuProductCodeStatus;
    }

    public String getSimuProductName() {
        return simuProductName;
    }

    public void setSimuProductName(String simuProductName) {
        this.simuProductName = simuProductName == null ? null : simuProductName.trim();
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

    public Integer getEnterType() {
        return enterType;
    }

    public void setEnterType(Integer enterType) {
        this.enterType = enterType;
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

    public Long getSimuOperatorId() {
        return simuOperatorId;
    }

    public void setSimuOperatorId(Long simuOperatorId) {
        this.simuOperatorId = simuOperatorId;
    }

    public String getSimuOperatorName() {
        return simuOperatorName;
    }

    public void setSimuOperatorName(String simuOperatorName) {
        this.simuOperatorName = simuOperatorName == null ? null : simuOperatorName.trim();
    }

    public Date getSimuOperatorTime() {
        return simuOperatorTime;
    }

    public void setSimuOperatorTime(Date simuOperatorTime) {
        this.simuOperatorTime = simuOperatorTime;
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

    public Integer getRiskResult() {
        return riskResult;
    }

    public void setRiskResult(Integer riskResult) {
        this.riskResult = riskResult;
    }
}