package dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	public AB ab(A aobj, B bobj) {
		AB abobj = new AB(aobj, bobj);
		abobj.setAobj(aobj);
		return abobj;
	}

	@Bean
	public A createA() {
		A aobj = new A();
		aobj.setA(90);
		aobj.setMsg("Good Afternoon");
		return aobj;
	}

	@Bean
	public B createB() {
		return new B(67, "Good Sunday");
	}

}
