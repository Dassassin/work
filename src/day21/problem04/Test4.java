package day21.problem04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Class<ShowText> clazz = ShowText.class;
        ShowText st = clazz.newInstance();
        Method m = clazz.getMethod("show");
        Object invoke = m.invoke(st);
    }
}
