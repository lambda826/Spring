package aop.advice.aroundAdvice.performanceMonitoring;

public class WorkerBean {

    public void doSomeWork(int times) {
        for(int x = 0; x < times; x++) {
            work();
        }
    }

    private void work() {
        System.out.print("");
    }
}
