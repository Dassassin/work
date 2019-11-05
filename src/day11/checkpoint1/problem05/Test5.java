package day11.checkpoint1.problem05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 500);
        date = calendar.getTime();
        System.out.println("从今天算起，500天后的日期是" + df.format(date));
    }
}
