package autowiringdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "autowiringdemo")
public class Employeeconfig {
	@Bean
	public Employee emp() {
		Employee employee = new Employee();
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setState("Telungana");
//		Employee e = new Employee(add);
		employee.setAddress(address);
		return employee;
	}
}
