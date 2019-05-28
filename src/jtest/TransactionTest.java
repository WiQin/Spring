package jtest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tran.Account;
import com.tran.service.AccountService;

@SuppressWarnings("all")
public class TransactionTest {
	@Test
	public void transaction_jdbc(){
		try {
			String path[] = {"com/briup/tran/jdbc/spring_jdbc.xml",
			 	"com/briup/tran/service/jdbc_service2.xml"};
			ApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			AccountService service = (AccountService)container.getBean("service");
			System.out.println(service.getClass());
			service.add(new Account(5,"tom5",2000));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void transaction_mybatis(){
		try {
			String path[] = {"com/briup/tran/mybatis/spring_mybatis.xml",
					"com/briup/tran/service/mybatis_service2.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			
			AccountService service = (AccountService)container.getBean("service");
//			System.out.println(service.getClass());
			service.add(new Account(9,"tom9",2000));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
