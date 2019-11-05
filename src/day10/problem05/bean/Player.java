package day10.problem05.bean;

import day10.problem05.service.FightAble;
import day10.problem05.service.Impl.Magician;
import day10.problem05.service.Impl.Warrior;

public class Player {
    public FightAble fightAbleSelect(String str){
        if (str == "法力角色"){
            return new Magician();
        }
        if (str == "武力角色"){
            return new Warrior();
        }
        return null;
    }
}
