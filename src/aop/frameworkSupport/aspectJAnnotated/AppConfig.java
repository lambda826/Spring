package aop.frameworkSupport.aspectJAnnotated;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = {"aop.frameworkSupport.aspectJAnnotated"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}
