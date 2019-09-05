package net.metrosystems.context.demo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("C2Impl")
public class C2Impl implements C {

  @PostConstruct
  public void init() {
    System.out.println("After C2Impl instance creation");
  }

  @Override
  public void printMessage() {
    System.out.println("C2");
  }
}
