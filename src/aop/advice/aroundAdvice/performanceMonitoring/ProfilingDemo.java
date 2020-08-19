package aop.advice.aroundAdvice.performanceMonitoring;

import aop.common.util.ProxyUtil;

public class ProfilingDemo {

    public static void main(String... args) {
        WorkerBean bean = ProxyUtil.getProxy(new WorkerBean(), new ProfilingInterceptor());
        bean.doSomeWork(10000000);
    }
}
