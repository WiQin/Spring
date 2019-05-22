package com.theory.aop.staticProxy;

public class Test {
	
	public static void main(String[] args) {
		//创建委托类/目标类
		HelloService target = new HelloServiceImpl();
		//创建代理类
		HelloService proxy = new HelloServiceProxy(target);
		//调用方法
		//如果调用委托类的方法，则没有特殊内容
		//target.sayHello();
		
		//如果调用代理类的方法，方法真正的执行者
		//还是委托类，但是可以提供一些特殊内容
		proxy.sayHello();
		System.out.println(proxy.toString());
	}
	
}
