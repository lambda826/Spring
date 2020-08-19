package aop.advice.afterAdvice.simpleAfterAdvice;

import aop.common.entity.Guitarist;
import aop.common.util.ProxyUtil;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class SimpleAfterReturningAdvice implements AfterReturningAdvice {

    public static void main(String... args) {
        Guitarist proxy = ProxyUtil.getProxy(new Guitarist(), new SimpleAfterReturningAdvice());
        proxy.sing();
        proxy.sing2(2);
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("********** After ********** '" + method.getName());
    }
}
