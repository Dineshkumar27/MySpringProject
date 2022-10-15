package scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	@Bean
	@Scope("prototype")
	@Lazy(true)
	public Hello hello() {
		return new Hello();
	}
}
