package annotation.homework;

import annotation.workItea.Annot;
import annotation.workItea.MyDefault;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by james on 7/20/16.
 * This class for ...
 */
public class MyInvocationHandler implements InvocationHandler {
// keep center

    @Override

    public Object invoke(Object o, Method method, Object[] args) throws Throwable {

        MyDefault annotation1 = method.getAnnotation(MyDefault.class);
        Class<Annot> clazz = Annot.class;
        Method stringRandom = clazz.getDeclaredMethod("stringRandom");
        MyDefault annotation = stringRandom.getAnnotation(MyDefault.class);
        System.out.println(annotation.value());

        return null;
    }
}
