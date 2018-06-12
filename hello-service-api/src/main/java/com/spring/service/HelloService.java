package com.spring.service;

import com.spring.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/24
 * Time: 16:39
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value="/hello4",method= RequestMethod.GET)
    String hello(@RequestParam("name") String name);
    @RequestMapping(value="/hello5",method=RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
    @RequestMapping(value="/hello6",method=RequestMethod.POST)
    String hello(@RequestBody User user);
}
