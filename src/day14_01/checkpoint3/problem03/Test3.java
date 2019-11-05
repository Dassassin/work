package day14_01.checkpoint3.problem03;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(getRandomNum(),"苹果");
        map.put(getRandomNum(),"香蕉");
        map.put(getRandomNum(),"西瓜");
        map.put(getRandomNum(),"橘子");
        System.out.println(map);
        System.out.print("输入商品号查询商品:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(map.containsKey(s)){
            System.out.println("根据商品号："+s+",查询到对应的商品为："+map.get(s));
        }else {
            System.out.println("查无此商品");
        }
    }

    private static String getRandomNum() {
        int i;
        int count = 0;
        char[] str = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while(count < 8) {
            i = Math.abs(r.nextInt(10));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }
}
