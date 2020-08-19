package aop.pointcut.dynamicMethodPointcut;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.common.util.ProxyUtil;

public class DynamicPointcutDemo {

    public static void main(String... args) {

        SampleBean proxy = ProxyUtil.getProxy(new SampleBean(), new AroundAdvice(), new SimpleDynamicPointcut());
        proxy.foo(1);
        proxy.foo(10);
        proxy.foo(100);

        proxy.bar();
        proxy.bar();
        proxy.bar();
    }
}
