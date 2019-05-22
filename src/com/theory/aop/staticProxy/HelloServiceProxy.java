package com.theory.aop.staticProxy;

//代理类
public class HelloServiceProxy implements HelloService{
	private HelloService target;
	public HelloServiceProxy(HelloService target) {
		this.target = target;
	}

	@Override
	public void sayHello() {
		System.out.println("log:sayHello马上要执行了...");
		target.sayHello();
		System.out.println("log:sayHello马上要执行了...");
	}
	
	@Override
	public String toString() {
		System.out.println("toString被调用了");
		return target.toString();
	}
	
}
