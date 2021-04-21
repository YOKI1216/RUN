package day03;

import java.util.Scanner;

public class day03anonym {
    private int a = 10;
    private int b = 100;
    private int c = 1000;
    private int d = 10000;
    private int f = 100000;
    public static void main(String[] args) {
        day03anonym anonym = new day03anonym();//建立了一个对象
        anonym.a=9;

        //匿名对象
        new day03anonym();//创建一个匿名对象
        new day03anonym().a=9;//匿名对象只能使用一次，下次使用时得再创建
        //
        new day03anonym().use();//如果使用对象只有一次，那么可以使用匿名对象
        //匿名对象作为方法参数
        getreslut(new Scanner(System.in));
        Scanner sc=sc();
        int num = sc.nextInt();
        System.out.println("num is"+num);
    }
    public static void use(){
        System.out.println("you use it one time");
    }
    public static void getreslut(Scanner sc) {
        int i = sc.nextInt();
        System.out.println("is" + i);
    }
    public static Scanner sc(){
        return new Scanner(System.in);//匿名对象作为返回值
    }
}
