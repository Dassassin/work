package day10.problem04;

import day10.problem04.bean.Apple;
import day10.problem04.bean.Worker;
import day10.problem04.service.CompareAble;
import day10.problem04.service.Impl.Compare;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");
        System.out.println("默认挑大的：");
        Compare compare = new Compare();
        Apple biggestApple = worker.pickApple(compare, a1, a2);
        System.out.println(biggestApple.getSice()+"-"+biggestApple.getColor());
        System.out.println("挑红的：");
        new Worker(){
            public Apple pickApple(Apple a1, Apple a2) {
                List<Apple> list = new ArrayList<>();
                list.add(a1);
                list.add(a2);
                for (Apple apple:list){
                    if(apple.getColor()=="红色"){
                        System.out.println(apple.getSice()+"-"+apple.getColor());
                    }
                }
                return null;
            }
        }.pickApple(a1,a2);
    }
}
