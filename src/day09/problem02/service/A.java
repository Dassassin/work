package day09.problem02.service;

public interface A {
    void showA();

    default void showB(){
        System.out.println("BBBB");
    }
}
