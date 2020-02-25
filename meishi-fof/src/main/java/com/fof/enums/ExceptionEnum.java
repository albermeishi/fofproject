package com.fof.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 通信返回码类型
 */
public enum ExceptionEnum {
	SUCCESS("请求成功", 1008),
	FAILURE("请求失败", 1009),
	INVALID("token失效",1010),
	PARAMS_ERROR("参数错误",1011);
	
	/**
	 * 描述
	 */
	private String message;
	/**
	 * 返回码
	 */
	private Integer code;
	  private static Map<Integer, ExceptionEnum> enumMap = new HashMap();
	    public static ExceptionEnum getEnum(int code){
	        return enumMap.get(code);
	    }

	    public static String getMessage(int code){
	        ExceptionEnum en = getEnum(code);
	        if(en == null){
	            return getMessage(88888);
	        }
	        return en.getMessage();
	    }
	private ExceptionEnum(String message, Integer code) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	 static{
	        ExceptionEnum[] enums = values();
	        ExceptionEnum[] newEnums = enums;

	        for (int i = 0; i < newEnums.length; i++) {
	            ExceptionEnum en = newEnums[i];
	            enumMap.put(en.getCode(), en);
	        }
	    }
}
