package com.theory.aop.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		//1.创建目标对象
		IStudentService target = 
				new StudentServiceImpl();
		//2.创建代理对象
		ClassLoader loader = target.getClass().getClassLoader();//参数1 目标对象的类加载器对象
		Class<?>[] interfaces = target.getClass().getInterfaces();//参数2 目标对象所实现的所有接口. Class类型数组
		//代理对象应该怎么做:比如加个日志
		InvocationHandler h = new MyHandler(target);//参数3 InvocationHandler接口的实现类对象


		IStudentService proxy = (IStudentService) Proxy.newProxyInstance(
				loader, interfaces, h);
		//3.使用目标对象调用方法的话，没有
		//  使用代理对象调用方法的话，有
		proxy.save(new Student());
		proxy.delete(1L);
		proxy.find(2L);
		System.out.println("代理类:"+proxy.toString());
		System.out.println("目标类:"+target.toString());
		System.out.println("代理类的真面目:"+proxy.getClass());
	}
}
