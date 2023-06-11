package resphoer.springframework.test;


import org.junit.Test;

import resphoer.springframework.test.bean.IUserService;
import springframework.context.support.ClassPathXmlApplicationContext;

public class ApiTest {
   @Test
   public void test_autoProxy(){
      ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
      IUserService userService = applicationContext.getBean("userService", IUserService.class);
      System.out.println("测试结果：" + userService.queryUserInfo());
   }
}
