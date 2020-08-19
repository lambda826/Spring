package aop.pointcut.staticMethodPointcut;


import aop.common.entity.Singer;

public class GreatGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("I shot the sheriff");
        System.out.println("But I did not shoot the deputy");
    }
}
