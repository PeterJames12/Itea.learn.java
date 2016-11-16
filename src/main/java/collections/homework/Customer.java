package collections.homework;


public class Customer {

    public static void main(String[] args) {

        Box<Integer, Integer> box = new Box<>(new BiNode<>(12, 12));

        box.add(12,12);
        box.add(12,12);
        box.add(17,12);
        System.out.println(box.print());
    }
}
