package speldemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;
	private long mobileNumber;

	public String getName() {
		return name;
	}

	@Value("Rohit")
	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	@Value("9878098988")
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
