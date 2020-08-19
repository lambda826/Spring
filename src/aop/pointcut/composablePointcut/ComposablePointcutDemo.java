package aop.pointcut.composablePointcut;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.common.entity.Guitar;
import aop.common.util.ProxyUtil;
import aop.pointcut.simpleNameMatching.GrammyGuitarist;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.StaticMethodMatcher;

import java.lang.reflect.Method;

public class ComposablePointcutDemo {

    public static void main(String... args) {
        GrammyGuitarist johnMayer = new GrammyGuitarist();
        ComposablePointcut composablePointcut = new ComposablePointcut(ClassFilter.TRUE, new SingMethodMatcher());

        System.out.println("Test 1 >> ");
        GrammyGuitarist proxy = ProxyUtil.getProxy(johnMayer, new AroundAdvice(), composablePointcut);
        testInvoke(proxy);
        System.out.println();

        System.out.println("Test 2 >> ");
        composablePointcut.union(new TalkMethodMatcher());
        proxy = ProxyUtil.getProxy(johnMayer, new AroundAdvice(), composablePointcut);
        testInvoke(proxy);
        System.out.println();

        System.out.println("Test 3 >> ");
        composablePointcut.intersection(new RestMethodMatcher());
        proxy = ProxyUtil.getProxy(johnMayer, new AroundAdvice(), composablePointcut);
        testInvoke(proxy);
    }

    private static void testInvoke(GrammyGuitarist proxy) {
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.talk();
        proxy.rest();
    }

    private static class SingMethodMatcher extends StaticMethodMatcher {
        @Override
        public boolean matches(Method method, Class<?> cls) {
            return (method.getName().startsWith("sing"));
        }
    }

    private static class TalkMethodMatcher extends StaticMethodMatcher {
        @Override
        public boolean matches(Method method, Class<?> cls) {
            return "talk".equals(method.getName());
        }
    }

    private static class RestMethodMatcher extends StaticMethodMatcher {
        @Override
        public boolean matches(Method method, Class<?> cls) {
            return (method.getName().endsWith("st"));
        }
    }
}
