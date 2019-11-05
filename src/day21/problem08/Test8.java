package day21.problem08;

import java.lang.reflect.Method;
import java.util.Properties;

public class Test8 {
    public static void main(String[] args) throws Exception{
        Properties pro = new Properties();
        pro.load(Test8.class.getResourceAsStream("/DemoClass.properties"));
        String className = pro.getProperty("class");
        Class c = Class.forName(className);
        Class<DemoClass> clazz = DemoClass.class;
        DemoClass dc = clazz.newInstance();
        Method m = clazz.getMethod("run");
        Object invoke = m.invoke(dc);
    }
}
