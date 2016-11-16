package collections.workItea;

import annotation.homework.IJust;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * author james
 */
@Data
@Log4j2
public class Collect {

    private  String name;
    private  Integer age;


    public void some() {
        setName("alsjhu");
        System.out.println(getName());
        SortedSet<Integer> sortedSet = new TreeSet<>();

        IJust just = age -> age += 12;

        Map<Keys, String> map = new EnumMap<>(Keys.class);

        map.put(Keys.MY, "Igor");
        map.put(Keys.UR, "Alex");

        System.out.println(map);

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        Iterator<Integer> iterator = list.iterator();

        List<Integer> collect = list.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());

        System.out.println(collect);

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
//                System.out.println(list);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {

        ArrayList<Integer> someEllement = new ArrayList<>();
        someEllement.add(4);
        someEllement.add(4);
        someEllement.add(4);
        someEllement.add(4);
        someEllement.add(4);

        Integer arr[] = new Integer[someEllement.size()];
        someEllement.toArray(arr);
        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(integers));

        Iterator<Integer> iterator = someEllement.iterator();
        Integer mas[] = new Integer[someEllement.size()];
        int i = 0;
        for (Integer aCollection : someEllement) {
            mas[i] = aCollection;
            i++;
        }
        System.out.println(Arrays.toString(mas));

        List list = new LinkedList();

        list.add(1);
        list. add(1);
        list.add(1);

        list.get(1);
        list.add(1, 5);

        System.out.println(list);

        int index = list.indexOf(1);


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(10);

        Iterator<Integer> iterator1 = hashSet.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() == 5) {
                System.out.println("yes");
            }
        }

        Map<Integer, String> check = new HashMap<>();
        check.put(1, "hahaha");

        Set<Integer> set = check.keySet();
        set.stream().filter(integer -> integer == 1).forEachOrdered(integer -> {
            System.out.println("yes");
        });

        check.values().stream().filter(s -> s.equals("hahaha")).forEach(s -> {
            System.out.println("yes");
        });

        Map<String, Integer> take = new HashMap<>();
        take.put("hahaha", 1);

        Integer hahaha = take.compute("hahaha", (s, value) -> value * 2);

        System.out.println(take);

    }
}
