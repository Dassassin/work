package day10.problem03;

import day10.problem03.bean.Receptionist;
import day10.problem03.bean.User;

public class Test3 {
    public static void main(String[] args) {
        User[] users = new User[50];
        for (int i = 0; i < users.length; i++){
            users[i] = new User();
            users[i].setUserId(i+1);
        }
        System.out.println("未分组：");
        System.out.print("[");
        for (int i = 0; i < users.length; i++){
            System.out.print(users[i].getUserId()+"-"+users[i].getUserType()+", ");
        }
        System.out.println("]");
        new Receptionist(){
            @Override
            public void recept() {
                for (int i = 0; i < 50; i++){
                    if (i>=10 && i<=19){
                        users[i].setUserType("v1");
                    }
                }
            }
        }.recept();
        new Receptionist(){
            @Override
            public void recept() {
                for (int i = 0; i < 50; i++){
                    if (i>=20 && i<=29){
                        users[i].setUserType("v2");
                    }
                }
            }
        }.recept();
        new Receptionist(){
            @Override
            public void recept() {
                for (int i = 0; i < 50; i++){
                    if (i<10 || i>29){
                        users[i].setUserType("A");
                    }
                }
            }
        }.recept();
        System.out.println("已分组：");
        for (int i = 0; i < 50; i++){
            if (i%9==0){
                System.out.println();
            }
            System.out.print(users[i].getUserId()+"-"+users[i].getUserType()+" ");
        }
    }
}
