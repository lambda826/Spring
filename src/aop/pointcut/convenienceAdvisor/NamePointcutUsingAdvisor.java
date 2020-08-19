package aop.pointcut.convenienceAdvisor;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.common.entity.Guitar;
import aop.pointcut.simpleNameMatching.GrammyGuitarist;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;


public class NamePointcutUsingAdvisor {

    public static void main(String... args) {
        GrammyGuitarist johnMayer = new GrammyGuitarist();
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor(new AroundAdvice());
        // Only advice the latter one
        advisor.setMappedNames("rest");
        advisor.setMappedNames("sing");

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnMayer);
        pf.addAdvisor(advisor);

        GrammyGuitarist proxy = (GrammyGuitarist) pf.getProxy();
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.rest();
        proxy.talk();
    }
}
