package net.metrosystems.context.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class B {

  @Autowired
  @Qualifier("C1Impl")
  private C c1;

  @Autowired
  @Qualifier("C2Impl")
  private C c2;

  @PostConstruct
  public void init() {
    System.out.println("After instantiation");
  }

  public String getString(String string) {
    return string;
  }

  public void printMessage() {
    c1.printMessage();
    c2.printMessage();
  }
}