package qualifierdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Job {
	@Autowired
	@Qualifier("p2")
	private Person person;

	public Job() {
		System.out.println("Default Constructor");

	}

	public Job(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Job [person=" + person + "]";
	}

}
