package jtest;

import com.bean.LifeBean;
import com.ioc.annotation.Boss;
import com.ioc.event.RainEvent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.bean.Teacher;

import java.sql.Connection;

//ioc功能的测试类
//每个方法测试一个知识点
//每个知识点对应src下面的一个package
//每个package中是这个知识点的配置方式

//这里面的方法名字和对应的src下面的package名字是对应的
//这个类中从上到下 方法的顺序就是我们学习ioc知识点的顺序
@SuppressWarnings("all")
public class IocTest {
	

	//本类中的测试方法中的代码大致的编写模式
	public void ioc_test() {

		try {
			//1 声明要读取的xml文件路径(如果有多个可以放在数组中)
			//2 读取xml文件创建spring的容器contanier
			//3 从容器container中根据配置的名字拿出需要使用的对象
			//4 使用对象进行操作(对象中的需要的各种数据和依赖的其他对象早已经被spring的容器注入进来)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 知识点:spring的set方式注入
	@Test
	public void ioc_set() {

		try {
			String[] path = {"com/ioc/set/set.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Student stu1 = (Student)container.getBean("stu1");

			System.out.println(stu1);
			System.out.println(stu1.getId());
			System.out.println(stu1.getAge());
			System.out.println(stu1.getName());

			Student stu2 = (Student)container.getBean("stu2");
			stu2.show();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 知识点:向一个对象中注入集合
	@Test
	public void ioc_collection() {
		try {
			String[] path = {"com/ioc/collection/collection.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点:构造器注入(之前的是set注入)
	@Test
	public void ioc_constructor() {
		try {
			String path = "com/ioc/constructor/constructor.xml";
			ApplicationContext container = 
						new ClassPathXmlApplicationContext(path);

			Student stu1 = (Student)container.getBean("stu");
			System.out.println(stu1);
			System.out.println(stu1.getAge());
			System.out.println(stu1.getId());
			System.out.println(stu1.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//知识点:自动注入
	@Test
	public void ioc_autowired() {
		try {
			String path = "com/ioc/autowired/autowired.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);

			Student student = (Student) container.getBean("student");
			Teacher teacher = (Teacher)container.getBean("teacher");

			System.out.println("student"+student);
			System.out.println("teacher"+teacher);
			System.out.println("teacher.student"+teacher.getStudent());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点:配置文件中的标签 bean和bean之间也是可以继承的
	@Test
	public void ioc_extend() {
		try {
			String[] path = {"com/ioc/extend/extends.xml"};
			ApplicationContext container = 
						new ClassPathXmlApplicationContext(path);

			Student stu2 = (Student)container.getBean("stu2");
			Student stu3 = (Student)container.getBean("stu3");
			System.out.println(stu2.getId());
			System.out.println(stu2.getAge());
			System.out.println(stu3.getId());
			System.out.println(stu3.getAge());

			Teacher teacher = (Teacher)container.getBean("teacher");
			Teacher tea2 = (Teacher)container.getBean("tea2");
			Teacher tea3 = (Teacher)container.getBean("tea3");
			System.out.println("tea2.getName"+tea2.getName());
			System.out.println("tea2.getStudent"+tea3.getStudent());
			System.out.println("tea3.getName"+tea3.getName());
			System.out.println("tea3.getStudent"+tea3.getStudent());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	//知识点:spring所管理对象的声明周期
	@Test
	public void ioc_life() {
		try {
			String path = "com/ioc/life/life.xml";
			ClassPathXmlApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			LifeBean life = (LifeBean) container.getBean("life");
			System.out.println(life);
			container.destroy();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点:一个xml配置文件中 导入另外一个xml配置文件
	@Test
	public void ioc_imp() {
		try {
			
//			String[] path = {"com/ioc/imp/teacher.xml","com/ioc/imp/student.xml"};
			String[] path = {"com/ioc/imp/import.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Student stu = (Student)container.getBean("student");
			Teacher tea = (Teacher)container.getBean("teacher");

            System.out.println(stu);
            System.out.println(tea);
            System.out.println(tea.getStudent());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点: 在xml中配置工厂类，然后通过这个工厂类获得工厂生产的实例
	@Test
	public void ioc_Factory() {
		try {
			String path = "com/ioc/factory/instancefactory.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Connection conn = (Connection) container.getBean("conn");
			Connection conn2 = (Connection) container.getBean("conn");
			Connection conn3 = (Connection) container.getBean("conn");
			Connection conn4 = (Connection) container.getBean("conn");

			System.out.println(conn);
			System.out.println(conn2);
			System.out.println(conn3);
			System.out.println(conn4);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点: 实例工厂
	@Test
	public void ioc_instanceFactory() {
		try {
			String path = "com/ioc/instanceFactory/instanceFactory.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Object factory = container.getBean("factory");
			Connection conn = (Connection)container.getBean("conn");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点: 静态工厂
	@Test
	public void ioc_staticFactory() {
		try {
			String path = "com/ioc/staticFactory/staticFactory.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Object factory = container.getBean("factory");
			Connection conn = (Connection)container.getBean("conn");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	//知识点: 使用自定义属性编辑器
	public void ioc_proEdit() {
		try {
			String[] path = {"com/ioc/proEdit/proEdit.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);

			com.ioc.proEdit.Student student = (com.ioc.proEdit.Student) container.getBean("student");
			System.out.println(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	//知识点: 自定义事件
	public void ioc_event() {
		try {
			String path = "com/ioc/event/event.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);

			//发布事件
			container.publishEvent(new RainEvent("rain"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	//知识点: ioc中的注解
	public void ioc_annotation() {
		try {
			String path = "com/ioc/annotation/annotation.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Boss boss = (Boss)container.getBean("boss");
			((ClassPathXmlApplicationContext) container).destroy();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
