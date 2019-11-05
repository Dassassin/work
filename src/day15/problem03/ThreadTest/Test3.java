package day15.problem03.ThreadTest;

public class Test3 {
    public static void main(String[] args) {
        MyThread mt = new MyThread("a");
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.print(Thread.currentThread().getName()+i+" ");
        }
        System.out.println();
    }
}
