package valueannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("basePackages = valueannotation")
@PropertySource("classpath:persondata.properties")
public class MyConfig {

}
