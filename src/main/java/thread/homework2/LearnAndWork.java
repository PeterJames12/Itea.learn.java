package thread.homework2;

import lombok.EqualsAndHashCode;

import lombok.Getter;
import lombok.Setter;

/**
 * author Igor
 */
public class LearnAndWork {

    public static void main(String[] args) {

        new Thread(MyAwesome::runFirst).start();
        new Thread(MyAwesome::runSecond).start();
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    private static class User {

        private String name;
        private int age;

    }

    private static class MyAwesome {

        private static User user = new User();

        private static void runFirst() {

            setUsersFirst(user);
            new LearnAndWork().printUsers(user);
        }

        private static void runSecond() {
            setUsersSecond(user);
            new LearnAndWork().printUsers(user);
        }
    }

    private static void setUsersFirst(User user) {

        user.setName("Alex");
        System.out.println(Thread.currentThread().getName() + " executed name " + user.getName());
        user.setAge(21);
        System.out.println(Thread.currentThread().getName() + " executed age " + user.getAge());
    }


    private static void setUsersSecond(User user) {

        user.setName("Bob");
        System.out.println(Thread.currentThread().getName() + " executed name " + user.getName());
        user.setAge(22);
        System.out.println(Thread.currentThread().getName() + " executed age " + user.getAge());
    }

    private void printUsers(User user) {

        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + user.getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + user.getAge());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
