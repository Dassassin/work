package day22.yesterday12;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) throws Exception {
        Class<Test> clazz= Test.class;
        Method method = clazz.getMethod("test");
        Book b = method.getAnnotation(Book.class);
        String value = b.value();
        double price = b.price();
        String[] authors = b.authors();
        System.out.println(value);
        System.out.println(price);
        System.out.println(Arrays.toString(authors));
    }
}
