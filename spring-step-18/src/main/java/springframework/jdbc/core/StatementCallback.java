package springframework.jdbc.core;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Generic callback interface for code that operates on a JDBC Statement.
 * @param <T>
 */
public interface StatementCallback<T> {
    T doInStatement(Statement statement) throws SQLException;
}
