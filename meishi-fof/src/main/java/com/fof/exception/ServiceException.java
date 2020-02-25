/**  
 * @Description:
 * @author author
 * @date 2020年2月25日 上午10:31:57  
 */
package com.fof.exception;

import com.fof.enums.ExceptionEnum;

public class ServiceException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer errCode;
    private String message;

    public ServiceException(Integer errCode){
        this.errCode = errCode;
        this.message = ExceptionEnum.getMessage(errCode);
    }
    public ServiceException(String message){
        this.message = message;
    }
    public ServiceException(int errCode, String message) {
        this.errCode = errCode;
        this.message = message;
    }

    public int getCode() {
        return errCode;
    }

    public void setCode(int errCode) {
        this.errCode = errCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
