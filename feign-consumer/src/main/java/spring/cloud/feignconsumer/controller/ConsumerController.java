package spring.cloud.feignconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.feignconsumer.entity.User;
import spring.cloud.feignconsumer.service.HelloService;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/24
 * Time: 15:28
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value="/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }
    @RequestMapping(value="/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder stringBuffer=new StringBuilder();
        stringBuffer.append(helloService.hello()).append("\n");
        stringBuffer.append(helloService.hello("didi")).append("\n");
        stringBuffer.append(helloService.hello(new User("didi",30))).append("\n");
        stringBuffer.append(helloService.hello("dd",20)).append("\n");
        return stringBuffer.toString();
    }
}
