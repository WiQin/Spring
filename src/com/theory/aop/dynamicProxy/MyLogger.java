package com.theory.aop.dynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyLogger {
	
	//特殊功能1
	public void logger(String msg){
		System.out.println(new SimpleDateFormat("yyy-MM-dd hh:mm:ss").format(new Date())+" log:"+msg);
	}
	//特殊功能2
	//特殊功能3
}
