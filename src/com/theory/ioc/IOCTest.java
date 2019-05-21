package com.theory.ioc;

public class IOCTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new BeanFactory();
		Student student = (Student)beanFactory.getBean("stu");
		Teacher teacher = (Teacher)beanFactory.getBean("t");
		System.out.println("通过读取配置文件创建，装配好的bean对象");
		System.out.println("stu"+student);
		System.out.println("t"+teacher);
		System.out.println("t.student"+teacher.getStudent());
	}
}
