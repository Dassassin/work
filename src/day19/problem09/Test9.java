package day19.problem09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            PrintStream ps = new PrintStream("test.txt");
            System.setOut(ps);
            System.out.println(s);
            ps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
