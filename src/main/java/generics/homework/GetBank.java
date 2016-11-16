package generics.homework;


public class GetBank {

    public static void main(String[] args) {

        Bank<Integer, String> bank = new Bank<>(new Node<>(23, "Better"));

        System.out.println("is empty: " + bank.isEmpty());

        bank.add(95, "Java");
        bank.add(23, "Linux");
        bank.add(23, "Arch");
        bank.add(17, "KPI");

        System.out.println("length: " + bank.length());
        System.out.println(bank.print());

        bank.removeAll();
        System.out.println("is empty: " + bank.isEmpty());

    }
}
