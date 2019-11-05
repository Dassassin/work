package day10.problem04.bean;

import day10.problem04.service.CompareAble;

public class Worker {
    public Apple pickApple(CompareAble compareAble, Apple a1, Apple a2){
        return compareAble.compare(a1,a2);
    }
}
