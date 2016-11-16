package annotation.beforeLesson;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by james on 16.07.16.
 * This class for ...
 */

public class Operation {

    static Map<String, Object> serviceMap = new HashMap<>();

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<SimpleService> simpleServiceClass = SimpleService.class;
        System.out.println(simpleServiceClass.getName());
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

        loadService("annotation.beforeLesson.SimpleService");
        loadService("annotation.beforeLesson.LazyService");

        serviceMap.keySet().forEach(System.out::println);
        serviceMap.values().forEach(System.out::println);
    }


    private static void loadService(String service) throws NoSuchMethodException, IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {

        Class<?> clazz = Class.forName(service);

        Class<LazyService> lazyServiceClass = LazyService.class;
        Service lazy = lazyServiceClass.getAnnotation(Service.class);

        Class<SimpleService> simpleServiceClass = SimpleService.class;
        Service annotation = simpleServiceClass.getAnnotation(Service.class);

        if (lazy.lazyLoad()) {
            System.out.println("LazyService lazy = true");

        } else {
            System.out.println("LazyService lazy = false");
        }

        if (annotation.lazyLoad()) {
            System.out.println("SimpleService lazy = true");
        } else {
            System.out.println("SimpleService lazy = false");
        }

        if (clazz.isAnnotationPresent(Service.class)) {
            Object o = clazz.newInstance();
            serviceMap.put(clazz.getName(), o);
        }

        /*
        Method generate = clazz.getMethod("generate");
        if (generate.isAnnotationPresent(Init.class)) {
            System.out.println("@Init present in " + generate.getName());
        }*/

    }

    private static <T> void inspectService(Class<T> service) {

        System.out.println("SimpleName: " + service.getSimpleName());

        Annotation[] declaredAnnotations = service.getDeclaredAnnotations();

        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println("name: " + ann.name() + "lazyLoad: " + ann.lazyLoad());
        } else {
            System.out.println("Does't have");
        }

        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }

        Annotation[] annotations = service.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        /*Class<SimpleService> simpleServiceClass = SimpleService.class;
        SimpleService simpleService = simpleServiceClass.newInstance();
        simpleService.generate();

        Class<?> simpleService1 = Class.forName("SimpleService");
        Object o = simpleService1.newInstance();
        SimpleService test = (SimpleService) o;
        test.initService();
*/
    }
}
