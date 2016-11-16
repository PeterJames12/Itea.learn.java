package java8.homework;


import java.util.*;
import java.util.function.BiFunction;

public class SinkCollect {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        generate(collection);

        System.out.println(mix(collection, (a, b) -> (a + b)));
    }

    private static Collection<Integer> generate(Collection<Integer> collection) {

        Random random = new Random();
        int size = 1 + random.nextInt(17);
        for (int i = 0; i <= size; i++) {
            int element = 1 + random.nextInt(12);
            collection.add(element);
        }
        return collection;
    }

    private static Collection<Integer> mix(Collection<Integer> collection, BiFunction<Integer, Integer, Integer> biFunction) {

        System.out.println("Collection before mix:");
        System.out.println(collection);

        Integer sumCollection = collection.stream().reduce((a, s) -> a + s).get();
        System.out.println("Collection after mix:");
        System.out.println(sumCollection);
//        or

        Integer[] mas = new Integer[collection.size()];

        collection.toArray(mas);
//        or
        Integer arr[] = new Integer[collection.size()];
        int i = 0;
        for (Integer aCollection : collection) {
            arr[i] = aCollection;
            i++;
        }

        Integer result = 0;
        for (int j = 1; j < mas.length; j++) {
            result = biFunction.apply(mas[0], mas[j]);
            mas[0] = result;
        }

        collection.clear();
        collection.add(result);

        System.out.println("Collection after mix:");
        return collection;
    }
}
