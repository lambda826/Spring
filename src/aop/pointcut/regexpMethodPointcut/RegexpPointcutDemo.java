package aop.pointcut.regexpMethodPointcut;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.common.entity.Guitarist;
import aop.common.util.ProxyUtil;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

public class RegexpPointcutDemo {

    public static void main(String... args) {
        JdkRegexpMethodPointcut jdkRegexpMethodPointcut = new JdkRegexpMethodPointcut();
        jdkRegexpMethodPointcut.setPattern(".*sing.*");
        Guitarist proxy = ProxyUtil.getProxy(new Guitarist(), new AroundAdvice(), jdkRegexpMethodPointcut);
        proxy.sing();
        proxy.sing2();
        proxy.rest();
    }
}
