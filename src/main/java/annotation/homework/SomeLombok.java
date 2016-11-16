package annotation.homework;

import annotation.workItea.Annot;
import annotation.workItea.MyDefault;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.*;

/**
 * Created by james on 7/19/16.
 * This class for ...
 */
//@Accessors(chain = true)
//@FieldDefaults(level = AccessLevel.PUBLIC)
//@Data
public class SomeLombok {

    String name = "Alex";

    Integer age = 21;

    public static void main(String[] args) {

        new SomeLombok().hello();

        IJust just = System.out::println;
        just.age(21);

        Consumer<Integer> age = System.out::println;
        age.accept(21);

        Supplier<String> name = () -> "Alex";
        System.out.println(name.get());

        UnaryOperator<Integer> unaryOperator = s -> s + 12;
        System.out.println(unaryOperator.apply(12));

        Function<String, Integer> function = s -> 1;
        System.out.println(function.apply("Hello"));

        BiFunction<Integer, Integer, Integer> biFunction = (a, s) -> a + s;
        System.out.println(biFunction.apply(5, 5));
    }

    private static void hello() {

        InvocationHandler handler = (o, method, objects) -> {
            Class<Annot> clazz = Annot.class;
            Method randomString = clazz.getMethod("randomString");
            MyDefault annotation = randomString.getAnnotation(MyDefault.class);
            System.out.println(annotation.value());

            return null;
        };

        IJust myProxy = (IJust) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IJust.class}, handler);
        IJust lambdaProxy = System.out::println;
//        myProxy.age(21);

    }

    //    @Delegate(types = IJust.class)
    private void test() {
//        set("Sleep");
//        get("WakeUp");
//        age(21);
    }
}
