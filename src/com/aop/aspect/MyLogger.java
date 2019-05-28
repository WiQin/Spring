package com.aop.aspect;

//切面类
public class MyLogger {

	//A切入点之前
	public void log(String msg){
		System.out.println("log:"+msg);
	}
	//B切入点之后
	public void log2(String msg){
		System.out.println("log:"+msg);
	}
	//等等
	public void log3(String msg){
		System.out.println("log:"+msg);
	}

	public void log4(String msg){
		System.out.println("log:"+msg);
	}


}
