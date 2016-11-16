package java8.beforeLesson;


import java.util.*;
import java.util.stream.Collectors;

public class MyStream {

    public static void main(String[] args) {

        Collection<People> peoples = Arrays.asList(new People("Alex", 21, "Man"), new People("Max", 18, "Man"), new People("Yura", 24, "Man"));

        List<People> collect = peoples.stream().filter(people -> people.getName().equals("Alex") && people.getAge() < 27 && people.getSex().equals("Man")).collect(Collectors.toList());


        Collection<String> os = Arrays.asList("57 windows", "57 mac", "57 linux");
        List<String> numbersDot = Arrays.asList("1,2,2,2,2,3,5,4,5");
        Collection uOs = new HashSet<>(os);
        uOs.forEach(System.out::println);


        System.out.println("Before filter");
        os.forEach(System.out::println);

        System.out.println("After filter");
        List<String> collect1 = os.stream().distinct().collect(Collectors.toList());
        collect1.forEach(System.out::println);


        System.out.println(os.stream().anyMatch("57 linux"::equals));
        System.out.println(os.stream().allMatch(s -> s.contains("57")));
        System.out.println(os.stream().noneMatch("Ubuntu"::equals));

        List<String> betterOs = os.stream().map(s -> s + " better").collect(Collectors.toList());
        betterOs.forEach(System.out::println);

        int[] numberFromCollection = os.stream().mapToInt(s -> Integer.parseInt(s.substring(1, 2))).toArray();
        System.out.println(Arrays.toString(numberFromCollection));

        String[] onlyNumbers = numbersDot.stream().flatMap(s -> Arrays.asList(s.split(",")).stream()).toArray(String[]::new);
        System.out.println(Arrays.toString(onlyNumbers));

        int sum = numbersDot.stream().flatMap(s -> Arrays.asList(s.split(",")).stream()).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
        // sorted collections
        List<String> skills = Arrays.asList("hello", "hello", "java", "linux", "android");

        List<String> sortedSkills = skills.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedSkills);

        List<String> sortedSkillsFromTail = skills.stream().sorted((s, t1) -> - s.compareTo(t1)).collect(Collectors.toList());
        System.out.println(sortedSkillsFromTail);

        List<String> uSkills = skills.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(uSkills);

        List<String> uSortedSkillsFromTail = skills.stream().sorted(((s, t1) -> -s.compareTo(t1))).distinct().collect(Collectors.toList());
        System.out.println(uSortedSkillsFromTail);
//        min and also max
        String max = skills.stream().max(String::compareTo).get();
        System.out.println(max);
        // Integer::compare
        String min = skills.stream().min(String::compareTo).get();
        System.out.println(min);

        List<Integer> collectNumbers = Arrays.asList(3, 5, 8, 12, 17, 23, 28, 32);
        Integer sumNumbers = collectNumbers.stream().reduce((a, b) -> a + b).orElse(0);
        System.out.println(sumNumbers);

        Integer maxFromCollectionNumber = collectNumbers.stream().reduce(Integer::max).orElse(-1);
        System.out.println(maxFromCollectionNumber);

        Integer sumParnuh = collectNumbers.stream().filter(a -> a % 2 != 0).reduce((s, t) -> s + t).orElse(0);
        System.out.println(sumParnuh);

        String[] skillsUpperCase = skills.stream().distinct().map(String::toUpperCase).toArray(String[]::new);
        System.out.println(Arrays.toString(skillsUpperCase));

        String byJoining = skills.stream().collect(Collectors.joining(":", "|", "|"));
        System.out.println(byJoining);

//        skills.stream().distinct().collect(Collectors.toMap(s -> s)


    }
}

class People {

    private String name;
    private int age;
    private String sex;


    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
