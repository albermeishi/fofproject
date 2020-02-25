package com.fof.enums;
/**
 * 通信返回码类型
 */
public enum InfoCode {
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
	private int code;

	private InfoCode(String message, int code) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
