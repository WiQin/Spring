package com.theory.aop.staticProxy;

//委托类/目标类/原始类
public class HelloServiceImpl implements HelloService{

	@Override
	public void sayHello() {
		//想要做某些操作
		System.out.println("hello world");
		//想要做某些操作
	}

}
