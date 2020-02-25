package com.fof.enums;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/25 13:55
 * @Description:
 */
public enum SimuProductPCodeStatusEnum {
    NONE(0, "暂无"),
    PRELIMINARY_CODE(1, "预备案编号"),
    FORMAL_CODE(2, "正式编号"),
    ;
    private Integer typeCode;
    private String typeName;

    SimuProductPCodeStatusEnum(Integer typeCode, String typeName) {
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
