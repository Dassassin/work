package day21.problem06;

import java.lang.reflect.Field;

public class Test6 {
    public static void main(String[] args) {

    }

    public void setProperty(Object obj,String propertyName,Object value) throws Exception {
        Field f=getProperty(obj,propertyName);
        f.setAccessible(true);
        f.set(obj,value);
    }

    public Field getProperty(Object obj,String propertyName) throws Exception{
        return obj.getClass().getDeclaredField(propertyName);
    }
}
