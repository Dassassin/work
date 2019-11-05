package day16.problem05;

import day12.checkpoint1.problem07.Test07;

public class Test5 implements Runnable{
    public static void main(String[] args) {
        Thread t = new Thread(new Test5());
        t.start();
    }

    public void run(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void run() {

    }
    //Runnable接口中的run()方法是无参的，所以重写方法时不能够带参数，
    //或者另外写一个带参数的方法，在重写run()方法中调用。
}
