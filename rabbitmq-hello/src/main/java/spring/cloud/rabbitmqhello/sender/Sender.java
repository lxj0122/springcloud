package spring.cloud.rabbitmqhello.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/24
 * Time: 11:05
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String content="hello "+ LocalDateTime.now();
        System.out.println("Sender:"+content);
        this.amqpTemplate.convertAndSend("hello3",content);
    }
}
