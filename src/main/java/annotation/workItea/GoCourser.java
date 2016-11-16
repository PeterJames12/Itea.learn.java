package annotation.workItea;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by james on 7/19/16.
 * This class for ...
 */
@Repeatable(value = Sink.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface GoCourser {

    String where() default "here";

    String when() default "7p.m";
}
