package day06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        long time_start = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date);
        Date date01 = new Date(1614082108484L);
        System.out.println(date01);
        long time = date.getTime();
        System.out.println(time);
        SimpleDateFormat sdf =new SimpleDateFormat("yyy年mm月dd日 HH时mm分ss秒");
        String d= sdf.format(date);
        System.out.println(d);
        System.out.println(date);

        for (int i = 0; i < 1000; i++) {
        }
        long time_end = System.currentTimeMillis();
        System.out.println(time_end-time_start);
        Integer i = 1454;

    }
}
