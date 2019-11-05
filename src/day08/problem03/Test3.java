package day08.problem03;

public class Test3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("旺财");
        dog.setColor("黄");
        dog.setPrice(1000.00);
        dog.eat();
        dog.lookAfterTheHouse();
        System.out.println("----------");
        Cat cat = new Cat();
        cat.setName("波斯猫");
        cat.setColor("白");
        cat.setPrice(200.00);
        cat.eat();
        cat.catchMouse();
    }
}
