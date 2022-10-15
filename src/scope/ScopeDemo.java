package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println("Spring Container is ready");
		Hello h1 = (Hello) context.getBean("hello");
		Hello h2 = (Hello) context.getBean("hello");
		System.out.println(h1 == h2);

	}

}
