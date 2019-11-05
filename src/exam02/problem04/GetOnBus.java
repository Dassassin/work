package exam02.problem04;

import java.util.concurrent.locks.ReentrantLock;

public class GetOnBus implements Runnable{
    private int seat = 80;
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (seat <= 0){
                lock.unlock();
                break;
            }
            System.out.println(Thread.currentThread().getName()+"上车---还剩"+(seat-1)+"个座");
            seat--;
            lock.unlock();
        }

    }
}
