package annotation.beforeLesson;

import java.lang.annotation.*;

/**
 * Created by james on 16.07.16.
 * This class for ...
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Init {

    boolean suppressExeption() default false;
}
