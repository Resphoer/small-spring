package springframework.mybatis;

import mybatis.SqlSessionFactory;
import mybatis.SqlSessionFactoryBuilder;
import springframework.beans.factory.FactoryBean;
import springframework.beans.factory.InitializingBean;
import springframework.core.io.DefaultResourceLoader;
import springframework.core.io.Resource;

import java.io.InputStream;

public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory>, InitializingBean {
    private String resource;
    private SqlSessionFactory sqlSessionFactory;

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public SqlSessionFactory getObject() throws Exception {
        return sqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
        Resource resource = defaultResourceLoader.getResource(this.resource);
        try (InputStream inputStream = resource.getInputStream()) {
            this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception ee){
            ee.printStackTrace();
        }
    }
}
