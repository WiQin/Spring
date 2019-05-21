package com.ioc.annotation;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements BeanNameAware {
	private double price;
	private String name;
	
	public Car(){
		
	}
	
	public Car(double price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanName(String s) {
		System.out.println(s);
	}
}
