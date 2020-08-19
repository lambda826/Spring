package aop.aspectjSupport;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"aop.aspectjSupport.**"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
