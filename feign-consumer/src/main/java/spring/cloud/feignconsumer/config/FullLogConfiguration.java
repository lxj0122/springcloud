package spring.cloud.feignconsumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过配置类在不同的feign客户端调整日志级别 默认是none，不记录任何日志
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/25
 * Time: 13:51
 */
@Configuration
public class FullLogConfiguration {

    @Bean
    Logger.Level feignLoggerLeavel(){
        return Logger.Level.FULL;
    }
}
