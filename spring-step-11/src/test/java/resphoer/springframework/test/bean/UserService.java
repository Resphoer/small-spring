package resphoer.springframework.test.bean;

import springframework.beans.BeansException;
import springframework.beans.factory.*;
import springframework.core.io.context.ApplicationContext;
import springframework.core.io.context.ApplicationContextAware;

import java.util.Random;

public class UserService implements IUserService {

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "resphoer, 100001, 深圳";
    }

    @Override
    public String register(String username) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + username + " success ! ";
    }
}
