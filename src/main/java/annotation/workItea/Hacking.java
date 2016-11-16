package annotation.workItea;

import com.sun.istack.internal.Nullable;

import java.lang.reflect.Field;

/**
 * Created by james on 7/19/16.
 * This class for ...
 */
public class Hacking {

    public static void main(String[] args) {

        Class<Annot> annotClazz = Annot.class;

        Field[] fields = annotClazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
            if (field.isAnnotationPresent(Serializable.class)) {
                System.out.println("Nullable");

            }
        }
    }
}
