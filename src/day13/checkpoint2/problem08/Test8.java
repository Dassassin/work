package day13.checkpoint2.problem08;

import java.util.HashSet;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        while (true){
            int i = sc.nextInt();
            if (i == -1){
                break;
            } else {
                set.add(i);
            }
        }
        int sum = 0;
        for (int i:set){
            sum += i;
        }
        System.out.println("不重复数据的总和："+sum);
        System.out.println("不重复数据的平均值："+sum/set.size());
    }
}
