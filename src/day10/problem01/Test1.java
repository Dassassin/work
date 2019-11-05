package day10.problem01;

import java.math.BigDecimal;

public class Test1 {
    public static void main(String[] args) {
        String num = "23.23456789";
        System.out.println("原数字："+num);
        HandleAble handleAble = new HandleAble() {
            @Override
            public void HandleString(String num) {
                System.out.println("取整后："+Integer.parseInt(num.split("\\.")[0]));
            }
        };
        handleAble.HandleString(num);
        new HandleAble() {
            @Override
            public void HandleString(String num) {
                BigDecimal bigDecimal=new BigDecimal(num);
                System.out.println("保留4位小数后："+bigDecimal.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue());
            }
        }.HandleString(num);
    }


}
