package day13.checkpoint2.problem07;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        char[] chars = str.toCharArray();
        for (char c:chars) {
            System.out.print(c+" ");
            lhs.add(c);
        }
        System.out.println();
        for (char c:lhs) {
            System.out.print(c+" ");
        }
    }
}
