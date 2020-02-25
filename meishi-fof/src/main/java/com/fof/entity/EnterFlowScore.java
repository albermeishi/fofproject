package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class EnterFlowScore implements Serializable {
    private Long id;

    private Long userId;

    private String userName;

    private Integer scoreType;

    private Long enterFlowId;

    private Long tagId;

    private Long sourceId;

    private Integer scoreBigItemCode;

    private String scoreBigItemCodeText;

    private String scoreSmalItemCodeText;

    private Integer scoreSmalltemCode;

    private Integer currentScore;

    private Integer systemScore;

    private Integer totalScore;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public EnterFlowScore(Long id, Long userId, String userName, Integer scoreType, Long enterFlowId, Long tagId, Long sourceId, Integer scoreBigItemCode, String scoreBigItemCodeText, String scoreSmalItemCodeText, Integer scoreSmalltemCode, Integer currentScore, Integer systemScore, Integer totalScore, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.scoreType = scoreType;
        this.enterFlowId = enterFlowId;
        this.tagId = tagId;
        this.sourceId = sourceId;
        this.scoreBigItemCode = scoreBigItemCode;
        this.scoreBigItemCodeText = scoreBigItemCodeText;
        this.scoreSmalItemCodeText = scoreSmalItemCodeText;
        this.scoreSmalltemCode = scoreSmalltemCode;
        this.currentScore = currentScore;
        this.systemScore = systemScore;
        this.totalScore = totalScore;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public EnterFlowScore() {
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

    public Integer getScoreType() {
        return scoreType;
    }

    public void setScoreType(Integer scoreType) {
        this.scoreType = scoreType;
    }

    public Long getEnterFlowId() {
        return enterFlowId;
    }

    public void setEnterFlowId(Long enterFlowId) {
        this.enterFlowId = enterFlowId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getScoreBigItemCode() {
        return scoreBigItemCode;
    }

    public void setScoreBigItemCode(Integer scoreBigItemCode) {
        this.scoreBigItemCode = scoreBigItemCode;
    }

    public String getScoreBigItemCodeText() {
        return scoreBigItemCodeText;
    }

    public void setScoreBigItemCodeText(String scoreBigItemCodeText) {
        this.scoreBigItemCodeText = scoreBigItemCodeText == null ? null : scoreBigItemCodeText.trim();
    }

    public String getScoreSmalItemCodeText() {
        return scoreSmalItemCodeText;
    }

    public void setScoreSmalItemCodeText(String scoreSmalItemCodeText) {
        this.scoreSmalItemCodeText = scoreSmalItemCodeText == null ? null : scoreSmalItemCodeText.trim();
    }

    public Integer getScoreSmalltemCode() {
        return scoreSmalltemCode;
    }

    public void setScoreSmalltemCode(Integer scoreSmalltemCode) {
        this.scoreSmalltemCode = scoreSmalltemCode;
    }

    public Integer getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
    }

    public Integer getSystemScore() {
        return systemScore;
    }

    public void setSystemScore(Integer systemScore) {
        this.systemScore = systemScore;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
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
}