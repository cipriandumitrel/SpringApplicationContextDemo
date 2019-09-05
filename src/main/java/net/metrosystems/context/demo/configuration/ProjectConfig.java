package net.metrosystems.context.demo.configuration;

import net.metrosystems.context.demo.beans.A;
import net.metrosystems.context.demo.beans.D;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "net.metrosystems.context.demo.services")
public class ProjectConfig {

  @Bean("A1")
  public A a() {
      return new A("property1");
  }

  @Bean("A2")
  public A a1() {
    return new A("property2");
  }

  @Bean
  @Scope("prototype")
  public D d() {
    return new D();
  }
}
