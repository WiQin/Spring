package com.aop.dao;


import com.aop.pojo.Account;
import org.springframework.stereotype.Component;

@Component("dao")
public class AccountDaoImpl implements AccountDao{
	
	//取款
	@Override
	public void withdraw(Account acc, double amt) {
		System.out.println("账号成功取款"+amt);
	}
	
	//存款
	@Override
	public void deposit(Account acc, double amt) {
		System.out.println("账号成功存款"+amt);
	}
}
