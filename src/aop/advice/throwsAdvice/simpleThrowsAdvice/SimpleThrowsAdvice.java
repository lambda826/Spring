package aop.advice.throwsAdvice.simpleThrowsAdvice;

import aop.common.util.ProxyUtil;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class SimpleThrowsAdvice implements ThrowsAdvice {

    public static void main(String... args) throws Exception {
        ErrorBean proxy = ProxyUtil.getProxy(new ErrorBean(), new SimpleThrowsAdvice());
        try {
            proxy.errorProneMethod();
        } catch (Exception ignored) {
        }
        try {
            proxy.otherErrorProneMethod();
        } catch (Exception ignored) {
        }
    }

    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("***");
        System.out.println("Generic Exception Capture");
        System.out.println("Caught: " + ex.getClass().getName());
        System.out.println("***\n");
    }


    public void afterThrowing(Method method, Object[] args, Object target, IllegalArgumentException ex) throws Throwable {
        System.out.println("***");
        System.out.println("IllegalArgumentException Capture");
        System.out.println("Caught: " + ex.getClass().getName());
        System.out.println("Method: " + method.getName());
        System.out.println("***\n");
    }
}
