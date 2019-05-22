package com.aop.dProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.springframework.beans.factory.FactoryBean;

//负责产生代理对象的工厂类
public class ProxyFactoryBean implements FactoryBean<Object>{
	private Object target;
	private Class<?>[] interfaces;
	private InvocationHandler handler;
	
	// 根据被代理对象使用JDK代理机制，产生代理对象
	// 此对象就是将来最终操作方法的对象 Proxy$..
	public Object getObject(){
		Object obj = null;
		//((LogHandler)handler).setTarget(target);
		obj = Proxy.newProxyInstance(target.getClass().getClassLoader(),interfaces, handler);
		return obj;
	}
	
	public InvocationHandler getHandler() {
		return handler;
	}
	public void setHandler(InvocationHandler handler) {
		this.handler = handler;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public Class<?>[] getInterfaces() {
		return interfaces;
	}
	public void setInterfaces(Class<?>[] interfaces) {
		this.interfaces = interfaces;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
}
