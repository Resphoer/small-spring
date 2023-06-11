package middleware.mybatis.test;

import com.alibaba.fastjson.JSON;
import middleware.mybatis.Resources;
import middleware.mybatis.SqlSession;
import middleware.mybatis.SqlSessionFactory;
import middleware.mybatis.SqlSessionFactoryBuilder;
import middleware.mybatis.test.po.User;
import org.junit.Test;

import java.io.Reader;

public class ApiTest {
    @Test
    public void test_queryUserInfoById() {
        String resource = "mybatis.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User user = session.selectOne("middleware.mybatis.test.dao.IUserDao.queryUserInfoById", 1L);
                System.out.println(user);
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
