package com.theory.aop.dynamicProxy;

//委托类/目标类(【被】代理)
public class StudentServiceImpl implements IStudentService{
	@Override
	public void save(Student student) {
		System.out.println("保存学生信息");
	}
	@Override
	public void delete(long id) {
		System.out.println("删除学生");
	}
	@Override
	public Student find(long id) {
		System.out.print("查找到学生");
		return new Student("Find", id);
	}
	/*public void find2(){
		System.out.println("自定义方法2");
	}*/
}
