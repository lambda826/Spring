package aop.advice.afterAdvice.keyGenAfterAdvice;

import aop.common.util.ProxyUtil;

public class AfterAdviceDemo {

    public static void main(String... args) {
        KeyGenerator keyGen = ProxyUtil.getProxy(new KeyGenerator(), new WeakKeyCheckAdvice());
        for (int x = 0; x < 10; x++) {
            try {
                long key = keyGen.getKey();
                System.out.println("Key: " + key);
            } catch (SecurityException ex) {
                System.out.println("Weak Key Generated!");
            }
        }
    }
}
