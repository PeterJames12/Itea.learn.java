package java8.workHomeJava8Part2;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * author Igor
 */
public class ForInstance {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<Refl> clazzVilli = Refl.class;

        int modifiers = clazzVilli.getModifiers();

        if (Modifier.isPrivate(modifiers)) {
            System.out.println("isPrivate");
        }

        Method[] declaredMethods = clazzVilli.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        Field[] declaredFields = clazzVilli.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Refl viilly = new Refl();
        Field person = viilly.getClass().getDeclaredField("age");
        person.setAccessible(true);
        Integer age = (Integer) person.get(viilly);
        System.out.println(age);

        person.setInt(viilly, 21);
        age = (Integer) person.get(viilly);
        System.out.println(age);

        person = viilly.getClass().getDeclaredField("name");
        person.setAccessible(true);
        String name = (String) person.get(viilly);
        System.out.println(name);

        person.set(viilly, "Igor");
        String newName = (String) person.get(viilly);
        System.out.println(newName);

        Method generate = viilly.getClass().getDeclaredMethod("lambda$main$1");
        generate.setAccessible(true);
        Object invoke = generate.invoke(viilly);

        final String fullName;
        if (invoke instanceof String) {
            fullName = (String) invoke;
        } else {
            fullName = "unknown";
        }
        System.out.println(fullName);

        Method functional = viilly.getClass().getDeclaredMethod("lambda$main$0");
        functional.setAccessible(true);
        Object invokeFunc = functional.invoke(viilly);

        final Integer fullAge;
        if (invokeFunc instanceof Integer) {
            fullAge = (Integer) invokeFunc;
        } else {
            fullAge = -1;
        }
        System.out.println(fullAge);
    }
}
