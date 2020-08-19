package aop.common.util;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class ProxyUtil {

    public static <T> T getProxy(T target, Advice advice) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);
        return (T) proxyFactory.getProxy();
    }

    public static <T> T getProxy(T target, Advice advice, Pointcut pointcut) {
        ProxyFactory proxyFactory = new ProxyFactory();
        Advisor advisor = new DefaultPointcutAdvisor(pointcut, advice);
        proxyFactory.addAdvisor(advisor);
        proxyFactory.setTarget(target);
        return (T) proxyFactory.getProxy();
    }


}
