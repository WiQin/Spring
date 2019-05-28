package com.tran.dao;

import org.springframework.dao.DataAccessException;

import com.tran.Account;

//dao层接口:JDBC:会有该接口的实现类,获取实现类对象
//		  :mybatis:会有映射文件，需要动态获取实现类对象
public interface AccountDao {
	void save(Account account) throws DataAccessException;
	void update(Account account) throws DataAccessException;
	void delete(Account account) throws DataAccessException;
}
