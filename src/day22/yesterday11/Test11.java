package day22.yesterday11;

import java.lang.reflect.Method;

public class Test11 {
    public static void main(String[] args) throws Exception {
        Class<Test> clazz= Test.class;
        Test test = clazz.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method m:methods){
            if (m.isAnnotationPresent(MyTest.class)){
                m.invoke(test);
            }
        }
    }
}
