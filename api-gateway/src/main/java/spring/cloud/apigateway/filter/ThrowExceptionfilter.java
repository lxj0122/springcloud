package spring.cloud.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/28
 * Time: 10:02
 */
//@Component
public class ThrowExceptionfilter extends ZuulFilter {
    private static Logger logger= LoggerFactory.getLogger(ThrowExceptionfilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        logger.info("this a pre filter,it will throw a RuntimeException");
        doSomething();
        return null;
    }

    private void doSomething(){
        throw new RuntimeException("Exist some error...");
    }
}
