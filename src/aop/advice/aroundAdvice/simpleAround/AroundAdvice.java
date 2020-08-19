package aop.advice.aroundAdvice.simpleAround;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor { // Around advice

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("********** Before **********");
        Object retVal = invocation.proceed();
        System.out.println("********** After **********");
        System.out.println();
        return retVal;
    }
}