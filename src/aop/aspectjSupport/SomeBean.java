package aop.aspectjSupport;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    public void printX() {
        System.out.println("bean1");
    }
}
