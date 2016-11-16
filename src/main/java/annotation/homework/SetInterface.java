package annotation.homework;

import annotation.workItea.Annot;
import annotation.workItea.GoCourser;
import annotation.workItea.MyDefault;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;


public class SetInterface {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        Arrays.stream(new int[]{2, 3, 4, 5})
                .map(s -> s + s).average().ifPresent(System.out::println);

        Set<String> listMethods = new HashSet<>();

        InvocationHandler handler = (o, method, objects) -> {
            listMethods.add("name of method: " + method.getName() + "\n" + "parameter: " + Arrays.toString(objects));
            return null;
        };

        IMyProxy myProxy = (IMyProxy) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IMyProxy.class}, handler);
        IMyProxy lambdaProxy = System.out::println;

        lambdaProxy.just("Just with lambda");
        myProxy.setName("Alex");
        myProxy.setAge(21);
        myProxy.how("good");
        myProxy.just("just");
        myProxy.toString();
        System.out.println("listMethods: ");
        listMethods.forEach(System.out::println);

        hackSomeMethod();
    }

//    @SneakyThrows(value = Exception.class)
    private static void hackSomeMethod() throws NoSuchMethodException, IllegalAccessException, InstantiationException, ClassNotFoundException {

        Class<Annot> someClazz = Annot.class;
        Method[] declaredMethods = someClazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(GoCourser.class)) {
                System.out.println("name of method: " + method.getName() + " with annotations: " +
                        Arrays.toString(method.getDeclaredAnnotations()));
            }
        }

        Method someMethod = someClazz.getDeclaredMethod("someMethod");
        GoCourser annotation = someMethod.getAnnotation(GoCourser.class);
        System.out.println(annotation.when());
        System.out.println(annotation.where());

        Annotation[] declaredAnnotations = someClazz.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println("annotation: " + declaredAnnotation);
        }

        System.out.println("default value from me Default.class: " + someClazz.getAnnotation(MyDefault.class).value());

        Class[] classes = {String.class};

        Method printMe = someClazz.getDeclaredMethod("printMe", classes);
        if (printMe.isAnnotationPresent(GoCourser.class)) {
            new Annot("").printMe("printMe");
        }
    }
}
