package aop.common.entity;


public class Guitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("sing");
    }

    public void sing2() {
        System.out.println("sing2");
    }
    public void sing2(int i) {
        System.out.println("sing2: " + i);
    }
    public void rest() {
        System.out.println("rest");
    }

}