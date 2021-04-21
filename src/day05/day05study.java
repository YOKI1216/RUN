package day05;

import day05test.test;

public class day05study {
    public static void main(String[] args) {
        animal one = new cat();//向上转型，创建一个子类对象当成父类对象使用
        one.eat();
        one.sleeep();
        cat two = (cat) one;//向下转型后，对象变成子类对象
        //向下转型不new创建对象，发生了关系变化
        two.cute();
        System.out.println(two.num);
        test third = new test();
        third.ture();
    }
}
