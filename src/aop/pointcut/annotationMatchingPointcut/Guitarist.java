package aop.pointcut.annotationMatchingPointcut;


import aop.common.entity.Guitar;
import aop.common.entity.Singer;


public class Guitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("sing");
    }

    @AdviceRequired
    public void sing(Guitar guitar) {
        System.out.println("sing - annotated: " + guitar.play());
    }

    public void rest() {
        System.out.println("rest");
    }

}
