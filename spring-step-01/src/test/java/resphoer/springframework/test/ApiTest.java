package resphoer.springframework.test;

import org.junit.Test;
import resphoer.springframework.BeanDefinition;
import resphoer.springframework.BeanFactory;
import resphoer.springframework.test.bean.UserService;

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1. 初始化 beanFactory 接口
        BeanFactory beanFactory = new BeanFactory();

        // 2. 定义 bean 对象，并注册
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
