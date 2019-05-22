package com.theory.aop.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	private IStudentService target;
	private MyLogger logger = new MyLogger();
	public MyHandler(IStudentService target) {
		this.target = target;
	}

	//方法真正执行
	// 参数1 将来所产生的代理对象 Proxy4$
	// 参数2 将来需要调用到的目标对象里面真正的那个方法的镜像
	// 参数3 将来调用方法的时候所传的参数
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//特殊内容，目标类不想做，代理类提供
		logger.logger(method.getName()+" 方法被执行前");
		//真正执行方法,代理类不实现，需要目标对象去真正执行method
		Object returnVal = method.invoke(target, args);
		logger.logger(method.getName()+" 方法被执行后");
		
		return returnVal;
	}

}
