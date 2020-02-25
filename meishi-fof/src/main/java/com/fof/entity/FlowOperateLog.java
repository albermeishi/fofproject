package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class FlowOperateLog implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private Integer operateType;

    private String flowType;

    private String flowTypeName;

    private Integer beforeCodeValue;

    private String beforeCodeText;

    private Integer afterCodeValue;

    private String afterCodeText;

    private String operateComment;

    private Date createTime;

    private Long flowId;

    private static final long serialVersionUID = 1L;

    public FlowOperateLog(Long id, Long userId, String userName, Integer operateType, String flowType, String flowTypeName, Integer beforeCodeValue, String beforeCodeText, Integer afterCodeValue, String afterCodeText, String operateComment, Date createTime, Long flowId) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.operateType = operateType;
        this.flowType = flowType;
        this.flowTypeName = flowTypeName;
        this.beforeCodeValue = beforeCodeValue;
        this.beforeCodeText = beforeCodeText;
        this.afterCodeValue = afterCodeValue;
        this.afterCodeText = afterCodeText;
        this.operateComment = operateComment;
        this.createTime = createTime;
        this.flowId = flowId;
    }

    public FlowOperateLog() {
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

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    public String getFlowTypeName() {
        return flowTypeName;
    }

    public void setFlowTypeName(String flowTypeName) {
        this.flowTypeName = flowTypeName == null ? null : flowTypeName.trim();
    }

    public Integer getBeforeCodeValue() {
        return beforeCodeValue;
    }

    public void setBeforeCodeValue(Integer beforeCodeValue) {
        this.beforeCodeValue = beforeCodeValue;
    }

    public String getBeforeCodeText() {
        return beforeCodeText;
    }

    public void setBeforeCodeText(String beforeCodeText) {
        this.beforeCodeText = beforeCodeText == null ? null : beforeCodeText.trim();
    }

    public Integer getAfterCodeValue() {
        return afterCodeValue;
    }

    public void setAfterCodeValue(Integer afterCodeValue) {
        this.afterCodeValue = afterCodeValue;
    }

    public String getAfterCodeText() {
        return afterCodeText;
    }

    public void setAfterCodeText(String afterCodeText) {
        this.afterCodeText = afterCodeText == null ? null : afterCodeText.trim();
    }

    public String getOperateComment() {
        return operateComment;
    }

    public void setOperateComment(String operateComment) {
        this.operateComment = operateComment == null ? null : operateComment.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }
}