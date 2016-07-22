package annotation.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * author james
 */
public class HoldOn {

    public static void main(String[] args) {

        InvocationHandler handler = (o, method, arg) -> {
            System.out.println("name of method: " + method.getName() + " arguments: " + Arrays.toString(arg));
            GSmart annotation = method.getAnnotation(GSmart.class);
            System.out.println(annotation.value());

            return null;
        };

        Trust holder = (Trust) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Trust.class}, handler);

        holder.showME();
    }
}
