package com.fof.response;

import java.io.Serializable;

import com.fof.enums.ExceptionEnum;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ResponseData<T> implements Serializable {
   
    /**
	 * 
	 */
	private static final long serialVersionUID = -4361804081822830622L;
	/**
     * 返回状态码
     */
    private Integer code;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 总记录数
     */
    private int total;

    public ResponseData(T data) {
        this.code = ExceptionEnum.SUCCESS.getCode();
        this.message = ExceptionEnum.SUCCESS.getMessage();
        this.data = data;
    }
    public ResponseData(Integer code,String message) {
        this.code = code;
        this.message =message;
      
    }
    public ResponseData(ExceptionEnum infoCode) {
        this.code = infoCode.getCode();
        this.message = infoCode.getMessage();
    }
    public ResponseData(ExceptionEnum infoCode, T data) {
        this.code = infoCode.getCode();
        this.message = infoCode.getMessage();
        this.data = data;
    }


   
  

   
}
