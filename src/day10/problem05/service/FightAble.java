package day10.problem05.service;

public interface FightAble {
    abstract void specialFight();

    default void commonFight(){
        System.out.println("普通攻击");
    }
}
