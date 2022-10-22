package autowiringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Address address;

	public Employee() {
		System.out.println("Default Constructor");
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Parameterized constructor");
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public void printEmployeeAddress() {
		System.out.println(address.getCity() + " " + address.getState());
		address.Hello();
	}

}
