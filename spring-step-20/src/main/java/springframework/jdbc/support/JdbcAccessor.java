package springframework.jdbc.support;

import cn.hutool.core.lang.Assert;
import com.alibaba.druid.pool.DruidDataSource;
import springframework.beans.factory.InitializingBean;


/**
 * Base class for {@link springframework.jdbc.core.JdbcTemplate} and
 *  * other JDBC-accessing DAO helpers, defining common properties such as
 *  * DataSource and exception translator.
 */
public abstract class JdbcAccessor implements InitializingBean {
    private DruidDataSource dataSource;

    public DruidDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DruidDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Obtain the DataSource for actual use.
     * @return the DataSource (never {@code null})
     * @throws IllegalStateException in case of no DataSource set
     * @since 5.0
     */
    protected DruidDataSource obtainDataSource() {
        DruidDataSource dataSource = getDataSource();
        Assert.state(dataSource != null, "No DataSource set");
        return dataSource;
    }

    /**
     * Eagerly initialize the exception translator, if demanded,
     * creating a default one for the specified DataSource if none set.
     */
    @Override
    public void afterPropertiesSet() {
        if (getDataSource() == null) {
            throw new IllegalArgumentException("Property 'dataSource' is required");
        }
    }

}
