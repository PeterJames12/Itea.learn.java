package annotation.workItea;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by james on 7/19/16.
 * This class for ...
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Sink {

    GoCourser[] value();
}
