package day16.problem11;

import java.util.concurrent.locks.ReentrantLock;

public class Employee implements Runnable{
    private int num = 100;
    ReentrantLock lock = new ReentrantLock();
    int front = 0;
    int back = 0;
    public void run() {
        while (true) {
            lock.lock();
            if (num <= 0){
                break;
            }
            String dcb = new DoubleColorBallUtil().create();
            System.out.println("编号为:"+(101-num)+"的员工从"+Thread.currentThread().getName()+"入场！拿到的的双色球彩票号码是:"+dcb);
            num--;
            if ("前门".equals(Thread.currentThread().getName())){
                front++;
            }
            if ("后门".equals(Thread.currentThread().getName())){
                back++;
            }
            lock.unlock();
        }
        if (num == 0){
            System.out.println("从前门入场的员工总共："+front+"位员工");
            System.out.println("从后门入场的员工总共："+back+"位员工");
        }
    }
}
