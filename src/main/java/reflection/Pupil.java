package reflection;

import lombok.SneakyThrows;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * author Igor
 */
public class Pupil {

    @SneakyThrows
    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        Class<? extends Teacher> clazz = teacher.getClass();

        Field mas = clazz.getDeclaredField("mas");
        Class<?> type = mas.getType();
        Class<?> componentType = type.getComponentType();

        Object arr = Array.newInstance(componentType, 5);

        System.out.println("Before: " + Arrays.toString((int[]) arr));
        Array.set(arr, 0, 1);
        Array.set(arr, 1, 10);
        Array.set(arr, 2, 25);
        Array.set(arr, 3, 23);
        Array.set(arr, 4, 19);
        System.out.println("After: " + Arrays.toString((int[]) arr));

        System.out.println("Before: " + Arrays.toString(teacher.getMas()));

        System.out.println(Teacher.class.toString());
        
        mas.setAccessible(true);
        mas.set(teacher, arr);

        System.out.println("After: " + Arrays.toString(teacher.getMas()));

    }
}
