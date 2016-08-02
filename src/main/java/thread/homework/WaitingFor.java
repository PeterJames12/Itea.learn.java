package thread.homework;

import lombok.val;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * author Igor
 */

/*
*
chinchilla [10:04 PM]
Домашнее задание по потокам:
Написать два потока которые будут по очереди выводить цифры. Первый поток - четные. Второй нечетные. После чего сохраняют все выведенные числа.
Должен так же быть третий поток который ждет завершений первых двух и после их окончания суммирует все числа из двух потоков и выводит на экран результат.
*
* */
public class WaitingFor {


    private static List<Integer> firstThread = new ArrayList<>();
    private static List<Integer> secondThread = new ArrayList<>();
    private static List<Integer> thirdThread = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        val myAwesomeFirst = new MyAwesomeFirst();
        val myAwesomeSecond = new MyAwesomeSecond();
        val myAwesomeThird = new MyAwesomeThird();

        myAwesomeFirst.start();
        myAwesomeFirst.join();
        myAwesomeSecond.start();
        myAwesomeSecond.join();
        myAwesomeThird.start();

    }

    private static class MyAwesomeFirst extends Thread {

        {
            setName("thread one: ");
        }

        @Override
        public void run() {
            firstThread = IntStream.rangeClosed(1, 12)
                    .filter(value -> value % 2 == 0)
                    .boxed()
                    .collect(Collectors.toList());

                   firstThread.forEach(value -> System.out.println(Thread.currentThread().getName() + value));

        }
    }

    private static class MyAwesomeSecond extends Thread {

        {
            setName("thread two: ");
        }

        @Override
        public void run() {

            secondThread = IntStream.rangeClosed(1, 12)
                    .filter(value -> value % 2 != 0)
                    .boxed()
                    .collect(Collectors.toList());

            secondThread.forEach(value -> System.out.println(Thread.currentThread().getName() + value));

        }
    }

    private static class MyAwesomeThird extends Thread {

        @Override
        public void run() {
            thirdThread.addAll(firstThread);
            thirdThread.addAll(secondThread);

            int buff = 0;

            for (Integer element : thirdThread) {
                buff += element;
            }
            System.out.println("total: " + buff);
        }

    }
}
