package spring.cloud.hello.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import spring.cloud.hello.entity.User;

import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/4
 * Time: 13:35
 */
@RestController
public class HelloController {

    private final Logger logger= Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value="/hello" , method= RequestMethod.GET)
    public String  index() throws InterruptedException {
        ServiceInstance serviceInstance=discoveryClient.getLocalServiceInstance();
        //测试超时
//        int sleepTime=new Random().nextInt(3000);
//        logger.info("sleepTime:"+sleepTime);
//        Thread.sleep(sleepTime);
        logger.info("/hello,host:"+serviceInstance.getHost()+",serviceId:"+serviceInstance.getServiceId());
//        List<String> serviceList=discoveryClient.getServices();
        /*if(!CollectionUtils.isEmpty(serviceList)){
            serviceList.stream().forEach(s->{
                List<ServiceInstance> serviceInstanceList=discoveryClient.getInstances(s);
                if(!CollectionUtils.isEmpty(serviceInstanceList)){
                    serviceInstanceList.stream().forEach(serviceInstance -> {
                        logger.info("/hello,host:"+serviceInstance.getHost()+",serviceId:"+serviceInstance.getServiceId());
                    });
                }
            });
        }*/
        return "hello world";
    }
    @RequestMapping(value="/hello1" ,method=RequestMethod.GET)
    public String hello(@RequestParam String name){
        return "hello "+name;
    }
    @RequestMapping(value="/hello2" ,method=RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age){
        return new User(name,age);
    }
    @RequestMapping(value="/hello3" ,method=RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "hello "+user.getName()+","+user.getAge();
    }
}
