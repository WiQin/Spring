package com.aop.service;


import javax.annotation.Resource;

import com.aop.dao.AccountDao;
import com.aop.pojo.Account;

//目标对象(target)
public class AccountServiceImpl implements IAccountService{
	private AccountDao accountDao;
	private Account account;
	
	//转账
	public void bankAction(){
		accountDao.withdraw(account, 100);
		accountDao.deposit(account, 100);
//		throw new RuntimeException("差不多吃饭了！");
	}
	
	public AccountDao getAccountDao() {
		return accountDao;
	}
	
	@Resource(name="dao")
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	public Account getAccount() {
		return account;
	}
	
	
	public void setAccount(Account account) {
		this.account = account;
	}

	
}
