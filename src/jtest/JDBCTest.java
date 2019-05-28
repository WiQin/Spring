package jtest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.db.Account;
import com.db.AccountDao;

@SuppressWarnings("all")
public class JDBCTest {
	//知识点: spring中配置jdbc的数据源
	@Test
	public void jdbc_dataSource(){
		try {
			String path = "com/db/jdbc/jdbc.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			AccountDao dao = (AccountDao) container.getBean("dao");
			dao.update(1, 1000);
			container.destroy();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void jdbc_jdbcTemplate(){
		try {
			String path = "com/db/jdbc/jdbcTemplate.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			AccountDao dao = (AccountDao) container.getBean("dao");
			dao.update(1, 1200);
			container.destroy();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
