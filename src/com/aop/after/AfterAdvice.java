package com.aop.after;

import com.aop.aspect.MyLogger;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName AfterAdvice
 * @Description
 * @Author Wangyw
 */
public class AfterAdvice implements AfterReturningAdvice {

    private MyLogger logger;

    public MyLogger getLogger() {
        return logger;
    }

    public void setLogger(MyLogger logger) {
        this.logger = logger;
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        logger.log("目标对象的方法自行结束后被调用"+o+method.toString());
    }
}
