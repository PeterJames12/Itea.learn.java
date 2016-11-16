package java8.workIteaJava8;


interface FooBar {
    default void foo() {
        System.out.println("foo");
    }
    void bar();
}