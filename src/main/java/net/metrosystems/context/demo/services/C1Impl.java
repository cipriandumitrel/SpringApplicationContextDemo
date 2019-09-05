package net.metrosystems.context.demo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("C1Impl")
public class C1Impl implements C {

  @PostConstruct
  public void init() {
    System.out.println("After C1Impl instance creation");
  }

  @Override
  public void printMessage() {
    System.out.println("C1");
  }
}
