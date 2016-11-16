package reflection;

import lombok.SneakyThrows;

/**
 * author Igor
 */
public class Contains {

    public static void main(String[] args) {

        char mas[] = {'1', '2', '3'};

        for (char element : mas){
            System.out.println((int) element);

        }

        System.out.println(doSomeExtraOrdinary());
    }

    @SneakyThrows
    private static int doSomeExtraOrdinary() {

        Class<Contains> containsClass = Contains.class;
        Anno doSomeExtraOrdinary = containsClass.getDeclaredMethod("doSomeExtraOrdinary").getDeclaredAnnotation(Anno.class);
        return doSomeExtraOrdinary.value();
    }

}
