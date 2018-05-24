package spring.cloud.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import spring.cloud.ribbonconsumer.service.HelloService;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/9
 * Time: 8:59
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    HelloService helloService;
    @RequestMapping(value="/ribbon-consumer",method= RequestMethod.GET)
    public  String helloConsumer(){
        return helloService.helloService();
//      return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}
