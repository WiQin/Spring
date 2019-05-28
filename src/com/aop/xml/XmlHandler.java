package com.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ClassName XmlHandler
 * @Description
 * @Author Wangyw
 */
public class XmlHandler {
    public void beforeTest(JoinPoint p){
        System.out.println(p.getSignature().getName()+" before...");
    }


    public void afterTest(JoinPoint p){
        System.out.println(p.getSignature().getName()+" after...");
    }

    public void afterReturningTest(JoinPoint p){

        System.out.println(p.getSignature().getName()+" afterReturning");

    }

    //在和aroundAdvice结合的时候,这个方法一定要加上这个ProceedingJoinPoint类型的参数
    public Object aroundTest(ProceedingJoinPoint pjp)throws Throwable{
        //JoinPoint对象不能调用连接点所表示的方法
        //ProceedingJoinPoint能调用连接点所表示的方法 pjp.proceed()
        System.out.println(pjp.getSignature().getName()+" is start..");
        //调用到连接点方法
        Object obj = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+" is end..");
        return obj;
    }

    public void throwingTest(JoinPoint p,Exception ex){
        System.out.println(p.getSignature().getName()+" is throwing..."+ex.getMessage());

    }
}
