package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class FlowBack implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private Long enterFlowScoreId;

    private Long flowId;

    private Date createTime;

    private String content;

    private Integer flowType;

    private static final long serialVersionUID = 1L;

    public FlowBack(Long id, Long userId, String userName, Long enterFlowScoreId, Long flowId, Date createTime, String content, Integer flowType) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.enterFlowScoreId = enterFlowScoreId;
        this.flowId = flowId;
        this.createTime = createTime;
        this.content = content;
        this.flowType = flowType;
    }

    public FlowBack() {
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

    public Long getEnterFlowScoreId() {
        return enterFlowScoreId;
    }

    public void setEnterFlowScoreId(Long enterFlowScoreId) {
        this.enterFlowScoreId = enterFlowScoreId;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getFlowType() {
        return flowType;
    }

    public void setFlowType(Integer flowType) {
        this.flowType = flowType;
    }
}