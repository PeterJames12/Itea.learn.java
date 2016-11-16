package reflection;

import lombok.SneakyThrows;
import lombok.val;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * author Igor
 */
public class Ref {

    @SneakyThrows
    public static void main(String[] args) {

        Flair person = new Flair();

        System.out.println(Arrays.toString(person.getMas()));

        Class<? extends Flair> clazz = person.getClass();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        String ref = (String) name.get(person);
        System.out.println(ref);
        name.set(person, "Bob");
        String newName = (String) name.get(person);

        System.out.println(newName);

        Field mas = clazz.getDeclaredField("mas");
        Class<?> type = mas.getType();
        Class<?> componentType = type.getComponentType();

        Object arr = Array.newInstance(componentType, 3);
        Array.set(arr, 0, 5);
        Array.set(arr, 1, 5);
        Array.set(arr, 2, 5);
        mas.setAccessible(true);
        mas.set(person, arr);
        System.out.println(Arrays.toString(person.getMas()));


        Method printMe = clazz.getDeclaredMethod("printMe");

    }
}
