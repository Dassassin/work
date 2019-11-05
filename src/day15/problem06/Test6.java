package day15.problem06;

import java.util.concurrent.locks.ReentrantLock;

public class Test6 {
    public static void main(String[] args) throws InterruptedException{
        Cup cup = new Cup();
        Thread t1 = new Thread(cup,"实体店");
        Thread t2 = new Thread(cup,"官网");
        t1.start();
        t2.start();
    }
}
