package spring.cloud.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/25
 * Time: 16:31
 */
@Component
public class AccessFilter extends ZuulFilter {
    private static Logger logger= LoggerFactory.getLogger(AccessFilter.class);
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
        RequestContext requestContext=RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        logger.info("send {} request to {}",request.getMethod(),request.getRequestURI().toString());
        String accessToken=request.getParameter("accessToken");
        if(StringUtils.isEmpty(accessToken)){
           logger.warn("access token is empty");
           requestContext.setSendZuulResponse(false);
//           requestContext.setResponseStatusCode(401);
           requestContext.setResponseBody("{\"result\":\"accessToken为空！\"}");
           requestContext.getResponse().setContentType("text/html;charset=UTF-8");
           return null;
        }
        logger.info("access token ok");
        return null;
    }
}
