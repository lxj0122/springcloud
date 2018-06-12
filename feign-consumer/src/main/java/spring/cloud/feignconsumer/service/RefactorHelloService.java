package spring.cloud.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import com.spring.service.HelloService;
/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/25
 * Time: 9:32
 */
@FeignClient(value="HELLO-SERVICE")
public interface RefactorHelloService extends HelloService {

}
