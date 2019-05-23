package com.aop.before;

import com.aop.aspect.MyLogger;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName BeforeAdvice
 * @Description
 * @Author Wangyw
 */
public class BeforeAdvice implements MethodBeforeAdvice {

    //切面类
    private MyLogger logger;

    //method:执行的方法镜像
    //objects：方法参数
    //target：目标对象
    //before中的代码在执行目标对象代码前执行
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        logger.log("方法执行前");
    }

    public MyLogger getLogger() {
        return logger;
    }

    public void setLogger(MyLogger logger) {
        this.logger = logger;
    }
}
