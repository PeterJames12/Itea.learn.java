package annotation.homework;

/**
 * Created by james on 7/20/16.
 * This class for ...
 */
public interface IMyProxy {

    default void setName(String name) {
        System.out.println(name);
    }

    default Integer setAge(Integer age) {
        System.out.println(age);
        return age;
    }

    default void how(String how) {
        System.out.println(how);
    }

    void just(String just);
}
