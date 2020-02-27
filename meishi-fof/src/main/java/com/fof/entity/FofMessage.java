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

   
}