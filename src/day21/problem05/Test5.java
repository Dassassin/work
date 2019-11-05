package day21.problem05;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws Exception{
        Class<A> clazz = A.class;
        A a = clazz.newInstance();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Method m = clazz.getMethod(str);
        Object invoke = m.invoke(a);
    }
}
