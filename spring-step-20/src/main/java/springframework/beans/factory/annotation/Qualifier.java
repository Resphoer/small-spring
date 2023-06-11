package springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * This annotation may be used on a field or parameter as a qualifier for
 *  * candidate beans when autowiring. It may also be used to annotate other
 *  * custom annotations that can then in turn be used as qualifiers.
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {
    String value() default "";
}
