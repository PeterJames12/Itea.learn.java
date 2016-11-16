package annotation.homework;

import annotation.workItea.GoCourser;
import annotation.workItea.MyDefault;
import annotation.workItea.MyNullable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by james on 7/20/16.
 * This class for ...
 */
public class Handler {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {

        Class<Bland> clazz = Bland.class;
        MyDefault annotation = clazz.getAnnotation(MyDefault.class);
        System.out.println(annotation.value());

        Method generate = clazz.getDeclaredMethod("generate");
        Field name = clazz.getDeclaredField("name");
        if (name.isAnnotationPresent(MyNullable.class)) {
            System.out.println("Yes");
        }
        if (generate.isAnnotationPresent(GoCourser.class)) {
            System.out.println("kjhu");
        }
    }
}
