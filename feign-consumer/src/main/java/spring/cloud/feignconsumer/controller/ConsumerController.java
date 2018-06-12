package spring.cloud.feignconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.feignconsumer.entity.User;
import spring.cloud.feignconsumer.service.HelloService;
import spring.cloud.feignconsumer.service.RefactorHelloService;

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

    @Autowired
    private RefactorHelloService refactorHelloService;

    @RequestMapping(value="/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }
    @RequestMapping(value="/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder s=new StringBuilder();
        s.append(helloService.hello()).append("\n");
        s.append(helloService.hello("didi")).append("\n");
        s.append(helloService.hello(new User("didi",30))).append("\n");
        s.append(helloService.hello("dd",20)).append("\n");
        return s.toString();
    }
    @RequestMapping(value="/feign-consumer3",method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(refactorHelloService.hello("mimi")).append("\n");
        stringBuilder.append(refactorHelloService.hello(new com.spring.entity.User("mimi",30))).append("\n");
        stringBuilder.append(refactorHelloService.hello("mimi",20)).append("\n");
        return stringBuilder.toString();
    }
}
