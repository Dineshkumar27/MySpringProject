package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// xml based configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello h1 = (Hello) context.getBean("hello");
		Hello h2 = (Hello) context.getBean("hello");
		System.out.println(h1 == h2);

		// Java based configuration
//		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//		System.out.println("Spring Container is ready");
//		Hello h1 = (Hello) context.getBean("hello");
//		Hello h2 = (Hello) context.getBean("hello");
//		System.out.println(h1 == h2);
//		h1.equals(h2);

	}

}
