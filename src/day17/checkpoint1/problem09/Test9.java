package day17.checkpoint1.problem09;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        int i = new Random().nextInt(101)+100;
        int sum = Sum(i);
        System.out.println("1到"+i+"的和为"+sum);
    }

    private static int Sum(int i) {
        if(i == 1){
            return 1;
        }
        return i + Sum(i-1);
    }
}
