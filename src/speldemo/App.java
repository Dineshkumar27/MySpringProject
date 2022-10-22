package speldemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("speldemo.xml");
		Customer cust = ctx.getBean("customer", Customer.class);
		System.out.println(cust.getCustomerName() + " " + cust.getPhoneNumber());

//		Person p = ctx.getBean("person", Person.class);
//		System.out.println(p.getMobileNumber());

//		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
//		Person p = (Person) ctx.getBean("person");
////		System.out.println(p.getEmail() + " " + p.getName());
//		System.out.println(p);
	}

}
