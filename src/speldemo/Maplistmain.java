package speldemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maplistmain {
	public static void main(String args[]) {
		// Get application context object.
		ApplicationContext context = new ClassPathXmlApplicationContext("speldemo.xml");

		// Get studentBean.
		Mynewstudent student = (Mynewstudent) context.getBean("studentBean");

		// Print student properties.
		System.out.println("From Map: " + student.getStu1());
		System.out.println("From List: " + student.getList());
	}
}