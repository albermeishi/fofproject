package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
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

}