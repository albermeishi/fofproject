package com.fof.exception;

import com.fof.enums.InfoCode;
import com.fof.response.MessageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.AuthenticationException;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Object defaultErrorHandler(Exception e) {
        logger.error("捕获业务异常：", e);
        //todo 对各种类型异常进行处理
        return new MessageInfo(InfoCode.FAILURE, e.getMessage());
    }
}
