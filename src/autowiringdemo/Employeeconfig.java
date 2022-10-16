package autowiringdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "autowiringdemo")
public class Employeeconfig {
	@Bean(name = "myemployee")
	public Employee emp() {
		Employee empl = new Employee();
		Address add = new Address();
		add.setCity("Hyderabad");
		add.setState("Telungana");
//		Employee e = new Employee(add);
		empl.setAddress(add);
		return empl;
	}
}
