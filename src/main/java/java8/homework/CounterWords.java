package java8.homework;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by james on 18.07.16.
 * This class for ...
 */
public class CounterWords {

    public static void main(String[] args) {

        giveMeSomeString("Hello java, Hello linux, Hello Itea");
    }

    private static void giveMeSomeString(String someString) {

        ArrayList<String> list = new ArrayList<>();
        list.add(someString);

        ArrayList<String> words =  createOurWords(list);
        String[] mas = words.stream().toArray(String[]::new);

        addCounter(mas);
    }

    private static ArrayList<String> createOurWords(ArrayList<String> list) {

        ArrayList<String> words = new ArrayList<>();
        for (String line : list) {
            words.addAll(Arrays.asList(line.split("[\\s,.!]+")));
        }
        return words;
    }

    private static void addCounter(String[] mas) {

        Arrays.sort(mas);

        int arr[] = new int[mas.length];
        int count = 1;
        int index = 0;
        int indexArr = 0;

        counter(mas, arr, count, index, indexArr);
        print(mas,arr);
    }

    private static void counter(String[] mas, int[] arr, int count, int index, int indexArr) {

        for (String ma : mas) {
            if (mas[index].equals(ma)) {
                arr[indexArr] = count;
                count++;
            }
        }
        if (indexArr < mas.length - 1) {
            counter(mas, arr, 1, index + 1, indexArr + 1);
        }
    }

    private static void print(String[] mas, int[] arr) {

        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j].equals(mas[j + 1])) {
                    mas[j] = "the same";
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            if (!mas[i].equals("the same") && arr[i] != 0) {
                System.out.println(arr[i] + "*" + mas[i]);
            }
        }
    }
}
