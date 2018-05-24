package spring.cloud.rabbitmqhello.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/24
 * Time: 11:08
 */
@Component
@RabbitListener(queues = "hello3")
public class Receiver {

    @RabbitHandler
    public void receive(String hello){
        System.out.println("Receiver:"+hello);
    }
}
