package aop.advice.beforeAdvice.securityBefore;

import aop.common.util.ProxyUtil;

public class SecurityDemo {

    public static void main(String... args) {
        SecurityManager mgr = new SecurityManager();
        mgr.login("John", "pwd");

        SecureBean beanProxy = ProxyUtil.getProxy(new SecureBean(), new SecurityAdvice());
        beanProxy.writeSecureMessage();
        mgr.logout();

        try {
            mgr.login("invalid user", "pwd");
            beanProxy.writeSecureMessage();
        } catch (SecurityException ex) {
            System.out.println("Exception Caught: " + ex.getMessage());
        } finally {
            mgr.logout();
        }

        try {
            beanProxy.writeSecureMessage();
        } catch (SecurityException ex) {
            System.out.println("Exception Caught: " + ex.getMessage());
        }
    }

}
