package day21.problem10;

import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class Test10 {
    /**
     * main入口
     * @param args 方法入口的参数
     * @throws Exception 执行方法所抛出的异常
     */
    public static void main(String[] args) throws Exception {
        Object obj = createObject();
        System.out.println(obj);
    }

    /**
     * 通过反射创建Stu对象
     * @return 返回obj
     * @throws Exception 执行方法所抛出的异常
     */
    public static Object createObject() throws Exception {
        Properties properties = new Properties();
        properties.load(new InputStreamReader(Test10.class.getResourceAsStream("/stu.properties"), "UTF-8"));
        Set<String> set = properties.stringPropertyNames();
        //读取属性文件中的class，通过反射拿到Class对象
        Class<?> aClass = Class.forName(properties.getProperty("class"));
        Object obj = aClass.newInstance();//相当于 new Student()
        for (String name : set) {
            String value = properties.getProperty(name);
            if (!name.equals("class")) {
//                Field field = aClass.getDeclaredField(name);
//                field.setAccessible(true);
//                if (field.getType() == int.class) {
//                    field.set(obj, Integer.parseInt(value));
//                } else {
//                    field.set(obj, value);
//                }
                if ("name".equals(name)) {
                    Method m = aClass.getMethod("setName", String.class);
                    Object invoke = m.invoke(obj, value);
                }
                if ("gender".equals(name)) {
                    Method m = aClass.getMethod("setGender", String.class);
                    Object invoke = m.invoke(obj, value);
                }
                if ("age".equals(name)) {
                    Method m = aClass.getMethod("setAge", int.class);
                    Object invoke = m.invoke(obj, Integer.parseInt(value));
                }
            }
        }
        return obj;
    }

}
