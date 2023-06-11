package resphoer.springframework.test;


import org.junit.Test;

import resphoer.springframework.test.bean.Husband;
import resphoer.springframework.test.bean.Wife;
import springframework.context.support.ClassPathXmlApplicationContext;

public class ApiTest {
   @Test
   public void test_circular() {
      ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
      Husband husband = applicationContext.getBean("husband", Husband.class);
      Wife wife = applicationContext.getBean("wife", Wife.class);
      System.out.println("老公的媳妇：" + husband.queryWife());
      System.out.println("媳妇的老公：" + wife.queryHusband());
   }
}
