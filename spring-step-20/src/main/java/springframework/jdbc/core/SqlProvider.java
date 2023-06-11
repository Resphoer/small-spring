package springframework.jdbc.core;

/**
 * Interface to be implemented by objects that can provide SQL strings.
 */
public interface SqlProvider {
    String getSql();
}
