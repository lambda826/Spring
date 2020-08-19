package aop.aspectjSupport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SomeBean bean = context.getBean(SomeBean.class);
        bean.printX();
        SomeBean2 bean2 = context.getBean(SomeBean2.class);
        bean2.printX();

    }
}
