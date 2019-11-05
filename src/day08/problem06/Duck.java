package day08.problem06;

public class Duck extends Fowl{
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃饭");
    }

    public void swim(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");
    }
}
