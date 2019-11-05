package day21.problem01;

import day16.problem07.service.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1 {

    @Before
    public void create(){
        Test1 t = new Test1();
    }
    @After
    public void setNull(){
        Test1 t = null;
    }
    @Test
    public void jia(){
        int a = 1;
        int b = 2;
        System.out.println(a+b);
    }
    @Test
    public void jian(){
        int a = 1;
        int b = 2;
        System.out.println(a-b);
    }
    @Test
    public void cheng(){
        int a = 1;
        int b = 2;
        System.out.println(a*b);
    }
    @Test
    public void chu(){
        int a = 1;
        int b = 2;
        System.out.println(b/a);
    }

}
