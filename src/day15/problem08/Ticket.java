package day15.problem08;

public class Ticket implements Runnable{
    private static Integer ticket = 20;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket <= 0) {
                    break;
                }
                ticket--;
                System.out.println("窗口"+Thread.currentThread().getName() + "卖了一张票，剩余票数为：" + ticket);
            }
        }
    }
}

