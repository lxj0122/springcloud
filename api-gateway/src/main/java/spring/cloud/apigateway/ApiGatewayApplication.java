package spring.cloud.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import spring.cloud.apigateway.filter.AccessFilter;
import spring.cloud.apigateway.filter.ThrowExceptionfilter;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public AccessFilter accessFilter(){
	    return new AccessFilter();
    }
   /* @Bean
    public ThrowExceptionfilter throwExceptionfilter(){
	    return new ThrowExceptionfilter();
    }*/
}
