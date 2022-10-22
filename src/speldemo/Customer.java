package speldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private Person person;
	private String customerName;
	private long phoneNumber;

	public long getPhoneNumber() {
		return phoneNumber;
	}

	@Value("#{person.mobileNumber}")
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Person getPerson() {
		return person;
	}

	@Autowired
	@Value("#{person}")
	public void setPerson(Person person) {
		this.person = person;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Value("#{person.name}")
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
