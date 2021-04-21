package day09;

import java.io.IOException;
import java.util.Random;

public class day09MainCode implements sum_2{
    public static final int num = 666666;
    public static void main(String[] args) throws IOException{
        Random num = new Random();
        int num01 =num.nextInt();
        String str1 = "39487543";
        System.out.println(Integer.parseInt(str1));
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder("字符缓冲区");
        str3.append("我直接输入一个字符串");
        str3.append("\n我还想换个行");
        //转化成String对象
        System.out.println(str3.toString());
        System.out.println(sum.sum(day09MainCode.num,num01));
    }
    public static void time(Object name,String[] args)throws IOException{
        //运行时间计算
        long starttime = System.currentTimeMillis();

        long endtime = System.currentTimeMillis();
        double t = endtime -starttime;
        System.out.println(t);
    }
}
