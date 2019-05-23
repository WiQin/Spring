package com.aop.throwException;

import com.aop.aspect.MyLogger;

import java.lang.reflect.Method;

/**
 * @ClassName ThrowsAdvice
 * @Description
 * @Author Wangyw
 */
public class ThrowsAdvice implements org.springframework.aop.ThrowsAdvice {

    private MyLogger logger;

    public MyLogger getLogger() {
        return logger;
    }

    public void setLogger(MyLogger logger) {
        this.logger = logger;
    }

    public void afterThrowing(Method method,Object[] args,Object target,Exception e){
        logger.log("异常打印"+e.getMessage());
    }
}
