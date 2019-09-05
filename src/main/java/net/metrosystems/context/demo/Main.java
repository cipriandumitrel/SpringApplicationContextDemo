package net.metrosystems.context.demo;

import net.metrosystems.context.demo.beans.A;
import net.metrosystems.context.demo.beans.D;
import net.metrosystems.context.demo.configuration.ProjectConfig;
import net.metrosystems.context.demo.services.B;
import net.metrosystems.context.demo.services.C;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Main {

  public static void main(String[] args) {
    try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
      //A a = context.getBean(A.class);
      A a = context.getBean("A1", A.class);
      System.out.println(a.toString());
      //A a1 = context.getBean(A.class);
      A a1 = context.getBean("A2", A.class);
      System.out.println(a.equals(a1));
      System.out.println(a.getProperty());
      B b = context.getBean(B.class);
      System.out.println(b.getString("Hello World!"));

      b.printMessage();

      C c = context.getBean("C1Impl", C.class);

      D d = context.getBean(D.class);
      D d1 = context.getBean(D.class);
      System.out.println(d.equals(d1));
    }
  }
}
