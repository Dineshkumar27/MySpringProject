package autowiringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
//     to use xml based annotation
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("componentdemo.xml");
//		Employee employee = (Employee) ctx.getBean("employee");
//		employee.printEmployeeAddress();

		// to use java based annotation
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Employeeconfig.class);
		Employee employee = (Employee) ctx.getBean("employee");
		employee.printEmployeeAddress();
	}

}
