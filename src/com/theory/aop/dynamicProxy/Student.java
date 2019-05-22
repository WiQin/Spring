package com.theory.aop.dynamicProxy;

public class Student {
	private String name;
	private long id;
	public Student() {
		super();
	}
	public Student(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
