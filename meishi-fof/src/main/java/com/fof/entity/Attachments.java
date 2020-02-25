package com.fof.entity;

import java.io.Serializable;

public class Attachments implements Serializable {
    private Long id;

    private Integer source;

    private Integer status;

    private Long sourceId;

    private Integer code;

    private Integer codeType;

    private String fileType;

    private String fileUrl;

    private String fileName;

    private static final long serialVersionUID = 1L;

    public Attachments(Long id, Integer source, Integer status, Long sourceId, Integer code, Integer codeType, String fileType, String fileUrl, String fileName) {
        this.id = id;
        this.source = source;
        this.status = status;
        this.sourceId = sourceId;
        this.code = code;
        this.codeType = codeType;
        this.fileType = fileType;
        this.fileUrl = fileUrl;
        this.fileName = fileName;
    }

    public Attachments() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCodeType() {
        return codeType;
    }

    public void setCodeType(Integer codeType) {
        this.codeType = codeType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }
}