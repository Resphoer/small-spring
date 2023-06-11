package springframework.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Callback interface used by {@link JdbcTemplate}'s query methods.
 * @param <T>
 */
public interface ResultSetExtractor<T> {
    T extractData(ResultSet rs) throws SQLException;
}
