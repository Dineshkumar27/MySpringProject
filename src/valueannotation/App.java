package valueannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("valueannotationdemo.xml");
//		Person p = ctx.getBean("person1", Person.class);
//		System.out.println(p.getEmail() + " " + p.getName());

		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		Person p = (Person) ctx.getBean("person");
//		System.out.println(p.getEmail() + " " + p.getName());
		System.out.println(p);
	}

}
