package day17.checkpoint1.problem10;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        int i = new Random().nextInt(10)+1;
        int product = Product(i);
        System.out.println(i+"的阶乘为"+product);
    }

    private static int Product(int i) {
        if(i == 1){
            return 1;
        }
        return i * Product(i-1);
    }
}
