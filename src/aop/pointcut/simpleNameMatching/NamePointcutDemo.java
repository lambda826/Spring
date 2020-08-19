package aop.pointcut.simpleNameMatching;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.common.entity.Guitar;
import aop.common.util.ProxyUtil;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class NamePointcutDemo {

    public static void main(String... args) {

        NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
        nameMatchMethodPointcut.addMethodName("sing");
        nameMatchMethodPointcut.addMethodName("rest");

        GrammyGuitarist proxy = ProxyUtil.getProxy(new GrammyGuitarist(), new AroundAdvice(), nameMatchMethodPointcut);
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.rest();
        proxy.talk();
    }
}
