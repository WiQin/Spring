package com.aop.dProxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.IAccountService;

@SuppressWarnings("all")
public class DProxyTest {
	@Test
	public void proxyTest(){
		
		try {
			ApplicationContext ctx = 
				new ClassPathXmlApplicationContext
				("com/aop/dProxy/beans.xml");
			
			//其实这个拿到的名字为service的对象就是代理对象proxy
			IAccountService service = 
				(IAccountService)ctx.getBean("proxy");
			
			
			service.bankAction();
			System.out.println("-------------");
			System.out.println(service.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}