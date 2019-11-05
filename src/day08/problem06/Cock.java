package day08.problem06;

public class Cock extends Fowl{
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在啄米");
    }

    public void crow(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }
}
