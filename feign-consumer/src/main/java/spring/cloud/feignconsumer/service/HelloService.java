package spring.cloud.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import spring.cloud.feignconsumer.entity.User;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/24
 * Time: 15:25
 */
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
    @RequestMapping(value="/hello1",method= RequestMethod.GET)
    String hello(@RequestParam("name") String name);
    @RequestMapping(value="/hello2",method=RequestMethod.GET)
    User hello(@RequestHeader("name")String name,@RequestHeader("age") Integer age);
    @RequestMapping(value="/hello3",method=RequestMethod.POST)
    String hello(@RequestBody User user);

}
