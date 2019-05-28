package com.tran.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tran.Account;
import com.tran.dao.AccountDao;

//service层实现类【目标类】
@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao;
	
	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	//[connection事务管理器[数据源[conntion]]]
	@Override
	public void add(Account account) {
		accountDao.save(account);
//		throw new RuntimeException("事务测试");
	}
	//

	@Override
	public void update(Account account) {
		
	}

	@Override
	public void remove(Account account) {
		
	}

}
