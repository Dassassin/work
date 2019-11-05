package day13.checkpoint3.problem01;

import java.util.HashSet;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> redballs = new HashSet<>();
        while(redballs.size() < 6){
            int redball = r.nextInt(33) + 1;
            redballs.add(redball);
        }
        int blueball = r.nextInt(16) + 1;
        System.out.print("双色球红球号码是: ");
        for(Integer i:redballs) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("双色球篮球号码是: " + blueball);
    }
}
