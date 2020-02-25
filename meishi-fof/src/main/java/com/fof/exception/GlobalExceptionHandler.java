package com.fof.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fof.enums.ExceptionEnum;
import com.fof.response.ResponseData;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseData<String> defaultErrorHandler(Exception e) {
        logger.error("捕获业务异常：", e);
        if (e instanceof ServiceException) {   //判断异常是否是我们定义的异常
        	ServiceException serviceException = (ServiceException) e;
            return new ResponseData<String>(serviceException.getCode(),serviceException.getMessage());
        }else{
        	 //对各种类型异常进行处理 
            return new ResponseData<String>(ExceptionEnum.FAILURE, e.getMessage());
        }
    }
}
