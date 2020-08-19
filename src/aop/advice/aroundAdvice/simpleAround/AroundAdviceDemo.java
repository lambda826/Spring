package aop.advice.aroundAdvice.simpleAround;

import org.springframework.aop.framework.ProxyFactory;

public class AroundAdviceDemo {

    public static void main(String... args) {
        Target target = new Target();
        System.out.println("------------Original invocation: ");
        target.print();

        System.out.println("------------Proxy invocation: ");
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new AroundAdvice()); // Add advice to proxy factory
        proxyFactory.setTarget(target); // Weaving to target
        Target proxy = (Target) proxyFactory.getProxy(); // Get proxy
        proxy.print(); // Invoke on proxy
    }
}

