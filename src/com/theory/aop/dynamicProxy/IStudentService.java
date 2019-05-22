package com.theory.aop.dynamicProxy;

//要实现的接口(委托类，代理类)
public interface IStudentService {
	//保存
	void save(Student student);
	
	//删除
	void delete(long id);
	
	//查找
	Student find(long id);
}
