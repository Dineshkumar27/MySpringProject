package dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	public AB ab(B bobj) {
		AB ab = new AB(bobj);
		A aobj = new A();
		aobj.setA(90);
		aobj.setMsg("Afternoon");
		ab.setAobj(aobj);
		return ab;

	}

//
	@Bean
	public A createA() {
		A aobj = new A();
		aobj.setA(90);
		aobj.setMsg("Good Afternoon");
		return aobj;
	}

//
	@Bean
	public B createB() {
		return new B(67, "Good Sunday");
	}
//
}
