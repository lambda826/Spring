package aop.pointcut.simpleNameMatching;


import aop.common.entity.Guitar;
import aop.common.entity.Singer;


public class GrammyGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("sing");
    }

    public void sing(Guitar guitar) {
        System.out.println("sing: " + guitar.play());
    }

    public void rest() {
        System.out.println("rest");
    }

    public void talk() {
        System.out.println("talk");
    }
}
