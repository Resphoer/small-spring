package resphoer.springframework.test;


import org.junit.Test;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.operations.ClasspathedOperation;
import resphoer.springframework.test.bean.UserService;
import resphoer.springframework.test.event.CustomEvent;
import springframework.core.io.context.support.ClassPathXmlApplicationContext;

public class ApiTest {
    @Test
    public void test_event(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 101912900909086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }
}
