package com.theory.aop.cglib;

public class TestCglibProxy {
	public static void main(String[] args) {  
        MyCglibProxyFactory cglibFactory=new MyCglibProxyFactory();  
        
        //获取代理对象
        BookService proxy= 
        	(BookService)cglibFactory.getInstance(new BookService().getClass());  
        
        proxy.addBook();  
        System.out.println(proxy.toString());
        System.out.println("--"+proxy.getClass());
    }  
}
