package com.fof.enums;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/25 13:55
 * @Description:
 */
public enum SimuProductEnterTypeStatusEnum {
    COMMON(1, "一般组"),
    CORE(2, "核心组")
    ;
    private Integer typeCode;
    private String typeName;

    SimuProductEnterTypeStatusEnum(Integer typeCode, String typeName) {
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
