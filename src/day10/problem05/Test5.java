package day10.problem05;

import day10.problem05.bean.Player;
import day10.problem05.service.FightAble;
import day10.problem05.service.Impl.Magician;
import day10.problem05.service.Impl.Warrior;

public class Test5 {
    public static void main(String[] args) {
        Player player = new Player();
        FightAble fightAble1 = player.fightAbleSelect("法力角色");
        if(fightAble1 instanceof Magician){
            System.out.println("选择：法力角色");
            Magician magician = (Magician) fightAble1;
            magician.specialFight();
            magician.commonFight();
        }
        System.out.println("==========");
        FightAble fightAble2 = player.fightAbleSelect("武力角色");
        if(fightAble2 instanceof Warrior){
            System.out.println("选择：武力角色");
            Warrior warrior = (Warrior) fightAble2;
            warrior.specialFight();
            warrior.commonFight();
        }
    }
}
