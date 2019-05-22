package com.aop.dProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 拦截器
public class LogHandler implements InvocationHandler{
	// 注入目标对象
	// 因为这里要用反射调用目标对象方法
	private Object target;
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, 
			Object[] args) throws Throwable {
		Object obj = null;
		if(method.getName().equals("bankAction")&& !"".equals(method.getName())){
			//进行日志输出
			System.out.println("logger:"+
			proxy.getClass()+" method:"+method.getName()
			+" start!");
			//用反射调用目标对象的方法
			obj = method.invoke(this.target, args);
		}
		return obj;
	}
	
}
