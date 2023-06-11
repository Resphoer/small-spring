package springframework.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Helper class that provides static methods for obtaining JDBC Connections from a {@link javax.sql.DataSource}.
 */
public abstract class DataSourceUtils {
    /**
     * Obtain a Connection from the given DataSource.
     */
    public static Connection getConnection(DruidDataSource dataSource){
        try {
            return dataSource.getConnection().getConnection();
        }catch (SQLException e){
            throw new RuntimeException("Failed to obtain JDBC Connection", e);
        }
    }
}
