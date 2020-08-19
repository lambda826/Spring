package aop.pointcut.aspectJExpressionPointcut;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.common.entity.Guitarist;
import aop.common.util.ProxyUtil;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

public class AspectJExpPointcutDemo {

    public static void main(String... args) {
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression("execution(* sing*(..))");
        Guitarist proxy = ProxyUtil.getProxy(new Guitarist(), new AroundAdvice(), aspectJExpressionPointcut);
        proxy.sing();
        proxy.sing2();
        proxy.rest();
    }
}
