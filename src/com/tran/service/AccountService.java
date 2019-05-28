package com.tran.service;

import com.tran.Account;

//service层接口:会写实现类【目标类】
public interface AccountService {
	void add(Account account);
	void update(Account account);
	void remove(Account account);
}
