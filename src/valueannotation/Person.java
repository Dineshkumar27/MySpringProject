package valueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {// bean name: person
	@Value("${person.id}")
	private int id;
	@Value("#{'dinesh'.toUpperCase()}")
	private String name;
	@Value("${person.email}")
	private String email;

//no getter and setter method
	@Override
	public String toString() {

		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";

	}

}
