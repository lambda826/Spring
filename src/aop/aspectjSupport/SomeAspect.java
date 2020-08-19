package aop.aspectjSupport;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class SomeAspect {

    @Around("execution(* aop.aspectjSupport.*.printX(..))")
    public void time(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        joinPoint.proceed();
        stopWatch.stop();
        System.out.println("total time: " + stopWatch.getTotalTimeMillis());
    }
}
