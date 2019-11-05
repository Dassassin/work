package day11.checkpoint1.problem04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(df.parse("1996-08-09")));
    }
}
