package annotation.workItea;

import java.lang.annotation.*;

/**
 * Created by james on 7/19/16.
 * This class for ...
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.PARAMETER,ElementType.METHOD,ElementType.FIELD})
public @interface MyNullable {

    String name() default "hahaha";
}
