package aop.pointcut.staticMethodPointcut;


import aop.common.entity.Singer;

public class GoodGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("Who says I can't be free");
        System.out.println("From all of the things that I used to be");
    }
}
