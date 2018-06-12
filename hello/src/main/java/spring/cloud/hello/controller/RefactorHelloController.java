package spring.cloud.hello.controller;

import com.spring.entity.User;
import com.spring.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/25
 * Time: 9:21
 */
@RestController
public class RefactorHelloController implements HelloService {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello "+name;
    }

    @Override
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "name="+user.getName()+",age="+user.getAge();
    }
}
