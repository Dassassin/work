package day09.problem05.bean;

public class Test5 {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.eat();
        c.eat();
        if (d instanceof Dog){
            Dog dog = (Dog) d;
            dog.lookHome();
        }
        if (c instanceof Cat){
            Cat cat = (Cat) c;
            cat.catchMouse();
        }
    }
}
