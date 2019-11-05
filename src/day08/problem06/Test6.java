package day08.problem06;

public class Test6 {
    public static void main(String[] args) {
        Cock cock = new Cock();
        cock.setAge(2);
        cock.setColor("红色");
        cock.eat();
        cock.crow();
        Duck duck = new Duck();
        duck.setAge(1);
        duck.setColor("黑色");
        duck.eat();
        duck.swim();
    }
}
