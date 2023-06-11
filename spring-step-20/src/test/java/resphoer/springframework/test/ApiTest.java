package resphoer.springframework.test;


import org.junit.Before;
import org.junit.Test;

import resphoer.springframework.test.dao.IUserDao;
import resphoer.springframework.test.po.User;
import springframework.beans.factory.BeanFactory;
import springframework.context.support.ClassPathXmlApplicationContext;

import springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class ApiTest {
   @Test
   public void test_ClassPathXmlApplicationContext() {
      BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:spring.xml");
      IUserDao userDao = beanFactory.getBean("IUserDao", IUserDao.class);
      User user = userDao.queryUserInfoById(1L);
      System.out.println(user);
   }
}
