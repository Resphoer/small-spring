package resphoer.springframework.test;


import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Before;
import org.junit.Test;

import resphoer.springframework.test.bean.IUserService;
import resphoer.springframework.test.bean.UserService;
import resphoer.springframework.test.bean.UserServiceBeforeAdvice;
import resphoer.springframework.test.bean.UserServiceInterceptor;
import springframework.aop.AdvisedSupport;
import springframework.aop.ClassFilter;
import springframework.aop.MethodMatcher;
import springframework.aop.TargetSource;
import springframework.aop.aspectj.AspectJExpressionPointcut;
import springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import springframework.aop.framework.Cglib2AopProxy;
import springframework.aop.framework.JdkDynamicAopProxy;
import springframework.aop.framework.ProxyFactory;
import springframework.aop.framework.ReflectiveMethodInvocation;
import springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ApiTest {
   @Test
    public void test_property() {
       ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
       IUserService userService = applicationContext.getBean("userService", IUserService.class);
       System.out.println("测试结果：" + userService);
   }

   @Test
   public void test_scan() {
      ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
      IUserService userService = applicationContext.getBean("userService", IUserService.class);
      System.out.println("测试结果：" + userService.queryUserInfo());
   }
}
