package aop.advice.beforeAdvice.simpleBefore;

import aop.common.entity.Guitarist;
import aop.common.util.ProxyUtil;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SimpleBeforeAdvice implements MethodBeforeAdvice {

    public static void main(String... args) {
        Guitarist proxy = ProxyUtil.getProxy(new Guitarist(), new SimpleBeforeAdvice());
        proxy.sing();
        proxy.sing2(2);
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("********** Before ********** '" + method.getName());
        if (args.length > 0) {
            System.out.println("arg0:" + args[0]);
        }

    }
}



