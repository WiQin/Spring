package com.theory.aop.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyCglibProxyFactory implements MethodInterceptor {
	public static void main(String[] args) {
		//获取代理对象
		BookService proxy = (BookService) new MyCglibProxyFactory().getInstance(BookService.class);
		proxy.addBook();
	}
	//获取代理对象，子对象
	public Object getInstance(Class<?> c) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(c);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	//参数：Object为由CGLib动态生成的代理类实例，Method为上文中实体类所调用的被代理的方法引用，
	//Object[]为参数值列表，MethodProxy为生成的代理类对方法的代理引用。
	//返回：从代理实例的方法调用返回的值。
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println(method.getName()+"开始执行方法");
		// 这句代码最终会执行到我们目标对象中的方法
		Object value = proxy.invokeSuper(obj, args);
		System.out.println(method.getName()+"方法执行结束");
		return value;
	}
}
