package day10.problem05.service.Impl;

import day10.problem05.service.FightAble;

public class Warrior implements FightAble{
    @Override
    public void specialFight() {
        System.out.println("武器攻击");
    }
}
