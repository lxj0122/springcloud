package spring.cloud.streamhello.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import spring.cloud.streamhello.StreamHelloApplication;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/8
 * Time: 9:18
 */
@EnableBinding(value={Sink.class,SinkSender.class})
public class SinkReceiver {
    private static Logger logger= LoggerFactory.getLogger(StreamHelloApplication.class);
    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        logger.info("Received:"+payload);

    }
}
