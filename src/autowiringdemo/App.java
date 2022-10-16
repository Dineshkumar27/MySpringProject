package autowiringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("componentdemo.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		employee.printEmployeeAddress();

//		ApplicationContext ctx = new AnnotationConfigApplicationContext(Employeeconfig.class);
//		Employee employee = (Employee) ctx.getBean("myemployee");
//		employee.printEmployeeAddress();
	}

}
