package day14_02.checkpoint2.problem01.com.xiaomi.level2_01;

public class Father {
    public void eat() throws ToothPainException {
        System.out.println("吃到一个石子");
        try {
            throw new ToothPainException();
        } catch (ToothPainException e) {
            e.printStackTrace();
        }
    }

    public void drink(){
        System.out.println("喝什么都没有问题");
    }
}
