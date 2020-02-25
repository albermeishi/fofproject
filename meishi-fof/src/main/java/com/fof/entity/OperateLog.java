package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class OperateLog implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private Integer operateType;

    private String belongTable;

    private Long sourceId;

    private String tagId;

    private Date createTime;
    private String beforeJson;

    private String afterJson;

	public String getBeforeJson() {
		return beforeJson;
	}

	public void setBeforeJson(String beforeJson) {
		this.beforeJson = beforeJson;
	}

	public String getAfterJson() {
		return afterJson;
	}

	public void setAfterJson(String afterJson) {
		this.afterJson = afterJson;
	}

	
    private static final long serialVersionUID = 1L;

    public OperateLog(Long id, Long userId, String userName, Integer operateType, String belongTable, Long sourceId, String tagId, Date createTime,String beforeJson, String afterJson) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.operateType = operateType;
        this.belongTable = belongTable;
        this.sourceId = sourceId;
        this.tagId = tagId;
        this.createTime = createTime;
        this.afterJson=afterJson;
        this.beforeJson=beforeJson;
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

    public String getBelongTable() {
        return belongTable;
    }

    public void setBelongTable(String belongTable) {
        this.belongTable = belongTable == null ? null : belongTable.trim();
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}