package spring.cloud.rabbitmqhello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.cloud.rabbitmqhello.sender.Sender;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/24
 * Time: 11:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HelloApplicationTest {

    @Autowired
    private Sender sender;
    @Test
    public void helloApplicationTest(){
        sender.send();
    }
}
