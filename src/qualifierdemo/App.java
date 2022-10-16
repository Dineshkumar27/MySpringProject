package qualifierdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("qualifierdemo.xml");
		Job j = (Job) ctx.getBean("job");
		System.out.println(j);

//		Person p = (Person) ctx.getBean("p1");
//		System.out.println(p);

	}

}
