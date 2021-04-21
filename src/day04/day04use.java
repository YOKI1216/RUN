package day04;

import java.util.Arrays;

public class day04use implements day04interface {
    @Override
    public void methoAbs() {
        System.out.println("one method");
    }

    @Override
    public void methoAbs1() {
        System.out.println("two method");

    }

    public static void main(String[] args) {
        char[] name1 = "cuaihushdfuhsukdfhuksdhfuhsduf".toCharArray();
        Arrays.sort(name1);
        for (int i = name1.length - 1; i >= 0; i--) {
            System.out.print(name1[i]);
        }
        System.out.println(Math.PI);
        day04son one = new day04son();
        one.method();
        System.out.println("================");
        day04abstact_son two = new day04abstact_son();
        two.eat();
        day04use third = new day04use();
        third.methoAbs();
        System.out.println( day04interface.i);//接口常量的使用
        System.out.println("===================");
        day04fu four = new day04zi();
        System.out.println(four.age);
        four.fu();
        //four.zi();    父类没有zi这个方法
     }
}
