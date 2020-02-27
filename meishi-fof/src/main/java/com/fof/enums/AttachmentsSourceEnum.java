package com.fof.enums;

import lombok.Data;

/**
 *
 */
public enum AttachmentsSourceEnum {
    USER(1, "用户材料"),
    SIGN(2, "电子签章"),
    COMPANY(3, "公司材料"),
    FOF(4, "母基金材料"),
    ;

    private Integer typeCode;
    private String typeName;

    AttachmentsSourceEnum(Integer typeCode, String typeName) {
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

    public static AttachmentsSourceEnum getInstance(Integer type) {
        AttachmentsSourceEnum[] values = AttachmentsSourceEnum.values();
        for (AttachmentsSourceEnum statusEnum : values) {
            if(type.intValue() == statusEnum.getTypeCode().intValue()){
                return statusEnum;
            }
        }
        return null;
    }
}
