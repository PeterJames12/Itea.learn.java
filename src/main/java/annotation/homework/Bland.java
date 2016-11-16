package annotation.homework;

import annotation.workItea.GoCourser;
import annotation.workItea.MyDefault;
import annotation.workItea.MyNullable;
import com.sun.istack.internal.Nullable;

/**
 * Created by james on 7/20/16.
 * This class for ...
 */
@MyDefault
public class Bland {

    public static void main(String[] args) {

    }

    @MyNullable
    private String name;

    @GoCourser
    public void generate() {

        System.out.println("Hello Java");
    }
}
