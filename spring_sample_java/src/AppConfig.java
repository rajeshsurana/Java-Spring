import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.rajeshsurana.service.CustomerService;
import com.rajeshsurana.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.rajeshsurana"})
@PropertySource("app.properties")
public class AppConfig {
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name="customerService")
	@Scope("singleton")
	public CustomerService getCustomerService(){
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository(){
//		return new HibernateCustomerRepositoryImpl();
//	}

}
