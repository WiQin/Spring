package com.aop.around;

import com.aop.aspect.MyLogger;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @ClassName ArounndAdvice
 * @Description
 * @Author Wangyw
 */
public class ArounndAdvice implements MethodInterceptor {

    private MyLogger logger;

    public MyLogger getLogger() {
        return logger;
    }

    public void setLogger(MyLogger logger) {
        this.logger = logger;
    }

    //需要执行目标对象方法的调用
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        logger.log("前置通知"+invocation.getMethod().getName());
        //真正执行目标对象的方法
        Object returnValue = invocation.proceed();

        logger.log("后置通知"+invocation.getMethod().getName());
        return null;
    }
}
