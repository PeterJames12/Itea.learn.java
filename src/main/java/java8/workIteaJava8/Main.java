package java8.workIteaJava8;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        FooBar fooBar = () -> System.out.println("bar");
        fooBar.foo();
        fooBar.bar();

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> powM;
        powM = mathPow(list, (a) -> a * a);
        System.out.println(powM);

        List<Integer> correct;
        correct = filterCollections(list, (a) -> true);
        correct.forEach(System.out::println);

        Myfunc myfunc = System.out::println;
        Consumer<Integer> consumer = System.out::println;

        Ipow ipow = (pow1) -> System.out.println(Math.pow(pow1, 2));
        ipow.mathPow(5);

        IGeny<Integer, String> iGeny = (a, b) -> "Hello java 8";
        System.out.println(iGeny.completiti(1, ""));
        IdeaInterface ideaInterface = System.out::println;

        ideaInterface.gek();
        ideaInterface.gek(1);

        IdeaInterface idefInterface1 = new IdeaInterface() {
            @Override
            public void gek(int b) {
                System.out.println(b);
            }
        };

        idefInterface1.gek(1);

    }

    private static <T> List<T> mathPow(List<T> list, Function<T, T> f) {
       // List<T> result = list.stream().map(f::apply).collect(Collectors.toList());

        List<T> result = new ArrayList<>();
        for (T element : list) {
            result.add(f.apply(element));
        }
        return result;
    }

    private static List<Integer> filterCollections(List<Integer> list, Predicate p) {

        List<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            if (p.test(element)) {
                result.add(element);
            }

        }
        return result;
    }
}
