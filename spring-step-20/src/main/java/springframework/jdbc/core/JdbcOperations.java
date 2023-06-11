package springframework.jdbc.core;

import java.util.List;
import java.util.Map;

/**
 * Interface specifying a basic set of JDBC operations.
 */
public interface JdbcOperations {
    <T> T execute(StatementCallback<T> action);

    void execute(String sql);

    <T> T query(String sql, ResultSetExtractor<T> rse);

//    <T> T query(String sql, Object[] args, ResultSetExtractor<T> rse);

    <T> List<T> query(String sql, RowMapper<T> rowMapper);

    List<Map<String, Object>> queryForList(String sql);
}
