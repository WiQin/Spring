package jtest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.db.AccountDao;

@SuppressWarnings("all")
public class MyBatisTest {
	//知识点: spring中使用mybatis
	@Test
	public void mybatis_update(){
		try {
			String path = "com/db/mybatis/spring_mybatis.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			//mybatis动态生成的dao对象，映射接口的实现类对象
			//session.getMapper(AccountDao.class)
			AccountDao dao = (AccountDao) container.getBean("accountDao");
			dao.update(1, 1000);
			System.out.println(dao.getClass());
			container.destroy();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
