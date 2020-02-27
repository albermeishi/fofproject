package com.fof.entity;

import java.io.Serializable;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/26 16:58
 * @Description:
 */
public class EnterFlowDto extends EnterFlow implements Serializable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
