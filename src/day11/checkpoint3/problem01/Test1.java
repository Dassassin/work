package day11.checkpoint3.problem01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse("2016-12-18");
        df.applyPattern("yyyy年MM月dd日");
        System.out.println(df.format(date));
    }
}
