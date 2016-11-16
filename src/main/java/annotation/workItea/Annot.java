package annotation.workItea;


import lombok.val;

import java.lang.reflect.Method;

/**
 * Created by james on 7/19/16.
 * This class for ...
 */
@MyDefault
public class Annot {

    @MyNullable
    String someString = "test";

    @Serializable
    public Annot(String name) {
        this.name = name;
    }

    private String name = "hello";

    public static void main(String[] args) throws NoSuchMethodException {

        new Annot("").someMethod();
    }

    @GoCourser()
    public void printMe(String printMe) {

        System.out.println(printMe);
    }

    @GoCourser()
    public void someMethod() throws NoSuchMethodException {

        Method someMethod = getClass().getDeclaredMethod("someMethod");
        GoCourser annotation = someMethod.getAnnotation(GoCourser.class);

        String when = annotation.when();
        String where = annotation.where();
        System.out.println(when);
        System.out.println(where);
    }

    @MyDefault(12)
    public int stringRandom() throws NoSuchMethodException {

        Method stringRandom = getClass().getDeclaredMethod("stringRandom");
        MyDefault annotation = stringRandom.getAnnotation(MyDefault.class);
        return annotation.value();
    }
}
