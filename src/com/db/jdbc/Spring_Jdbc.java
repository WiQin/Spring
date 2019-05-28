package com.db.jdbc;


import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.db.AccountDao;

public class Spring_Jdbc implements AccountDao{
	//数据源[需要注入ioc]
	private DataSource dataSorce;//要创建datasource
	
	public DataSource getDataSorce() {
		return dataSorce;
	}

	public void setDataSorce(DataSource dataSorce) {
		this.dataSorce = dataSorce;
	}
	
	@Override
	public void update(int id, double balance) {
		try {
			Connection conn  = 
				dataSorce.getConnection();
			System.out.println("in update() of Spring_Jdbc  conn = "+conn);
			//conn:创建[prepare]statement,执行sql，处理结果集，关闭资源
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
