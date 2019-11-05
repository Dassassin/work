package day15.problem03.RunnableTest;

public class Test3 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr,"a");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.print(Thread.currentThread().getName()+i+" ");
        }
        System.out.println();
    }
}
