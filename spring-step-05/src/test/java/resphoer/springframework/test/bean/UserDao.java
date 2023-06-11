package resphoer.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "resphoer");
        hashMap.put("10002", "sonder");
        hashMap.put("10003", "residualhave");
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }
}
