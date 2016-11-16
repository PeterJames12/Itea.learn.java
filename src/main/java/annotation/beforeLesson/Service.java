package annotation.beforeLesson;

import java.lang.annotation.*;

/**
 * Created by james on 16.07.16.
 * This class for ...
 */
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {

    String name();

    boolean lazyLoad() default false;
}
