package com.fof.enums;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/25 13:55
 * @Description:
 */
public enum SimuProductPoolStatusEnum {
    FULL_POOL(1, "全量池"),
    OBSERVATION_POOL(2, "观察池"),
    ACCESS_POOL(3, "准入池"),
    COOPERATION_POOL(4, "合作池"),
    ;
    private Integer typeCode;
    private String typeName;

    SimuProductPoolStatusEnum(Integer typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
