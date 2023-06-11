package springframework.util;

/**
 * Simple strategy interface for resolving a String value.
 */
public interface StringValueResolver {
    String resolveStringValue(String strVal);
}
