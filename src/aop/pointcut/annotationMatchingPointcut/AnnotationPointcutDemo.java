package aop.pointcut.annotationMatchingPointcut;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.common.entity.Guitar;
import aop.common.util.ProxyUtil;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

public class AnnotationPointcutDemo {

    public static void main(String... args) {
        AnnotationMatchingPointcut pc = AnnotationMatchingPointcut.forMethodAnnotation(AdviceRequired.class);
        Guitarist proxy = ProxyUtil.getProxy(new Guitarist(), new AroundAdvice(), pc);
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.rest();
    }

}
