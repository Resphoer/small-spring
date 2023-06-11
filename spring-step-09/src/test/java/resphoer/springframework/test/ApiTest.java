package resphoer.springframework.test;


import org.junit.Test;

import org.openjdk.jol.info.ClassLayout;
import resphoer.springframework.test.bean.UserService;
import springframework.context.support.ClassPathXmlApplicationContext;

public class ApiTest {
    @Test
    public void test_prototype() {
        // 1. 初始化 BeanFactory 接口
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        context.registerShutdownHook();

        // 2. 获取 Bean 对象的调用方法
        UserService userService01 = context.getBean("userService", UserService.class);
        UserService userService02 = context.getBean("userService", UserService.class);

        // 3. 配置 scope="prototype/singleton"
        System.out.println(userService01);
        System.out.println(userService02);

        // 4. 输出十六进制哈希值
        System.out.println(userService01 + " 十六进制哈希值： " + Integer.toHexString(userService01.hashCode()));
        System.out.println(ClassLayout.parseInstance(userService01).toPrintable());
    }

    @Test
    public void test_factory_bean() {
        // 1. 初始化 BeanFactory 接口
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 调用代理方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println("测试结果： " + userService.queryUserInfo());
    }
}
