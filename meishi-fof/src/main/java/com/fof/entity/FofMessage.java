package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class FofMessage implements Serializable {
    private Long id;

    private Integer fromType;

    private Integer moduleType;

    private Long targetId;

    private Long msgId;

    private Integer sendType;

    private String content;

    private Integer readStatus;

    private Date createTime;

    private Date readTime;

    private static final long serialVersionUID = 1L;

    public FofMessage(Long id, Integer fromType, Integer moduleType, Long targetId, Long msgId, Integer sendType, String content, Integer readStatus, Date createTime, Date readTime) {
        this.id = id;
        this.fromType = fromType;
        this.moduleType = moduleType;
        this.targetId = targetId;
        this.msgId = msgId;
        this.sendType = sendType;
        this.content = content;
        this.readStatus = readStatus;
        this.createTime = createTime;
        this.readTime = readTime;
    }

    public FofMessage() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFromType() {
        return fromType;
    }

    public void setFromType(Integer fromType) {
        this.fromType = fromType;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }
}