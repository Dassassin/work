package day12.checkpoint3;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> pokerBox = new ArrayList<String>();
        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> numbers = new ArrayList<String>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        for(int i = 2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        for (String color : colors) {
            for(String number : numbers){
                String card = color+number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("小☺");
        pokerBox.add("大☠");
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        xiPai(pokerBox,player1,player2,player3,dipai);
        System.out.println("底牌："+dipai);
        System.out.println("玩家1："+player1);
        System.out.println("玩家2："+player2);
        System.out.println("玩家3："+player3);
    }

    public static void xiPai(ArrayList<String> pokerBox,ArrayList<String> player1,ArrayList<String> player2,ArrayList<String> player3,ArrayList<String> dipai){
        boolean xipai = true;
        while (xipai) {
            Collections.shuffle(pokerBox);
            for (int i = 0; i < pokerBox.size(); i++) {
                String card = pokerBox.get(i);
                if (i >= 51) {
                    if(card == "大☠"){
                        break;
                    }
                    dipai.add(card);
                    diZhu(player1, card);
                    diZhu(player2, card);
                    diZhu(player3, card);
                } else {
                    if (i % 3 == 0) {
                        player1.add(card);
                    } else if (i % 3 == 1) {
                        player2.add(card);
                    } else {
                        player3.add(card);
                    }
                }
                if (i == pokerBox.size()-1){
                    xipai = false;
                }
            }
        }
    }

    public static void diZhu(ArrayList<String> player,String card){
        for (int i = 0; i <player.size(); i++){
            if (player.get(i) == "大☠"){
                player.add(card);
                break;
            }
        }
    }
}
