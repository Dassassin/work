package day15.problem06;

import java.util.concurrent.locks.ReentrantLock;

public class Cup implements Runnable {
    private int count = 100;
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (count <= 0){
                lock.unlock();
                break;
            }
            System.out.println(Thread.currentThread().getName()+"卖出第"+(101-count)+"个，总共剩余"+(count-1)+"个");
            count--;
            lock.unlock();
        }
    }
}
