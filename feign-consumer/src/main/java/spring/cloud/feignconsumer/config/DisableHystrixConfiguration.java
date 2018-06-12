package spring.cloud.feignconsumer.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 针对某个服务关闭hystrix（熔断）支持时，在接口的@FeignClient注解中添加configuration=DisableHystrixConfiguration.class
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/25
 * Time: 11:31
 */
//@Configuration
public class DisableHystrixConfiguration {

   /* @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }*/
}
