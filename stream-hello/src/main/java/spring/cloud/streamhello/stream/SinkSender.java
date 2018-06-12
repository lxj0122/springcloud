package spring.cloud.streamhello.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;


/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/8
 * Time: 11:33
 */
@Component
public interface SinkSender {

    @Output(Source.OUTPUT)
    MessageChannel output();
}
