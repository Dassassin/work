package day21.problem02;

import day08.problem04.C;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        Method method = list.getClass().getMethod("add", Object.class);
        method.invoke(list, 1);
        method.invoke(list, 2);
        method.invoke(list, "Java反射机制测试");
        method.invoke(list, 3);
        System.out.println(list);
    }
}
