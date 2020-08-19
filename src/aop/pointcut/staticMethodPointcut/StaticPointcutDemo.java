package aop.pointcut.staticMethodPointcut;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.common.entity.Singer;
import aop.common.util.ProxyUtil;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;

public class StaticPointcutDemo {

    public static void main(String... args) {
        Pointcut pointcut = new SimpleStaticPointcut();
        Advice advice = new AroundAdvice();
        Singer proxy1 = ProxyUtil.getProxy(new GoodGuitarist(), advice, pointcut);
        Singer proxy2 = ProxyUtil.getProxy(new GreatGuitarist(), advice, pointcut);
        proxy1.sing();
        proxy2.sing();
    }

}
