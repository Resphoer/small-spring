package springframework.aop;

/**
 *  Filter that restricts matching of a pointcut or introduction to
 *  * a given set of target classes.
 */
public interface ClassFilter {
    boolean matches(Class<?> clazz);
}
