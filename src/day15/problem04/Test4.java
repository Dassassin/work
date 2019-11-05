package day15.problem04;

public class Test4 {
    public static void main(String[] args) {
        new Runnable(){
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        }.run();
        Runnable r = new Runnable(){
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println("显示画面");
                }
            }
        };
        new Thread(r).start();
    }
}
