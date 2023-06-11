package resphoer.springframework.test;

import cn.hutool.core.io.IoUtil;
import resphoer.springframework.test.common.MyBeanFactoryPostProcessor;
import resphoer.springframework.test.common.MyBeanPostProcessor;
import springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.junit.Before;
import org.junit.Test;

import resphoer.springframework.test.bean.UserDao;
import resphoer.springframework.test.bean.UserService;
import springframework.beans.PropertyValue;
import springframework.beans.PropertyValues;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.config.BeanReference;
import springframework.beans.factory.support.DefaultListableBeanFactory;
import springframework.context.support.ClassPathXmlApplicationContext;
import springframework.core.io.DefaultResourceLoader;
import springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ApiTest {
    @Test
    public void test_xml() {
        // 1. 初始化 BeanFactory 接口
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        context.registerShutdownHook();

        // 2. 获取 Bean 对象的调用方法
        UserService userService = context.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
        System.out.println("ApplicationContextAware: " + userService.getApplicationContext());
        System.out.println("BeanFactoryAware: " + userService.getBeanFactory());
    }

}
