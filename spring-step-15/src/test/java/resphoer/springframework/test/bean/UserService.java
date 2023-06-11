package resphoer.springframework.test.bean;

import springframework.beans.factory.annotation.Autowired;
import springframework.beans.factory.annotation.Value;
import springframework.context.stereotype.Component;

import java.util.Random;


public class UserService implements IUserService{
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "resphoer, 100001, 深圳" + ", " + token;
    }

    @Override
    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";

    }


}
