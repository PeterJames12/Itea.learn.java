package annotation.homework;

import annotation.workItea.Annot;
import lombok.experimental.Accessors;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by james on 7/20/16.
 * This class for ...
 */
@Accessors(chain = true)
public class User {

    private String name;
    private int age;

    public static void main(String[] args) {

        InvocationHandler handler = new MyInvocationHandler();

        Annot myProxy = (Annot) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Annot.class}, handler);

        System.out.println(handler);

        System.out.println("Hello");

        new User().generate();
    }

    private void printMe() {
        System.out.println(getName());
        System.out.println(getAge());
        some();
    }

    private void some() {
        System.out.println("Good");
    }
    private void generate() {
        setName("Igor");
        setAge(21);
        printMe();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
