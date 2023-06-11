package resphoer.springframework.test.bean;

import springframework.context.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<String, String>(){{
        put("10001", "resphoer, 北京，朝阳");
    }};

    public String queryUserName(String uid){
        return hashMap.get(uid);
    }
}
