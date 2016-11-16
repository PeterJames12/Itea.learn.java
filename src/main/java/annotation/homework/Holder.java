package annotation.homework;

import annotation.workItea.MyDefault;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * author james
 */
public class Holder {

    public static void main(String[] args) {

        showMe("arg");

        Trust forrew = System.out::println;

        forrew.showME();
    }

    @GSmart(value = 5)
    @SneakyThrows
    public static void showMe(String arg) {
        Class<Holder> clazz = Holder.class;
        Method showMe = clazz.getDeclaredMethod("showMe", String.class);
        GSmart annotation = showMe.getAnnotation(GSmart.class);
        System.out.println("value: " + annotation.value());
        System.out.println("type: " + annotation.annotationType());
        System.out.println("test");
    }

}
