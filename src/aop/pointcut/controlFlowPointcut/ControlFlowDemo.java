package aop.pointcut.controlFlowPointcut;

import aop.advice.aroundAdvice.simpleAround.AroundAdvice;
import aop.advice.beforeAdvice.simpleBefore.SimpleBeforeAdvice;
import aop.common.util.ProxyUtil;
import org.springframework.aop.support.ControlFlowPointcut;

public class ControlFlowDemo {

    public static void main(String... args) {
        ControlFlowDemo ex = new ControlFlowDemo();
        ex.run();
    }

    public void run() {
        TestBean proxy = ProxyUtil.getProxy(new TestBean(), new AroundAdvice(), new ControlFlowPointcut(ControlFlowDemo.class, "test"));
        System.out.println("\tTrying normal invoke");
        proxy.foo();

        System.out.println("\n\tTrying under ControlFlowDemo.test()");
        test(proxy);
    }

    private void test(TestBean bean) {
        bean.foo();
    }
}
