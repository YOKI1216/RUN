package day05test;

public class day05main {


    public static void main(String[] args) {
        son name1 = new son();
        System.out.println(name1.name);
        String[] str1 = {"dujfhuds"};
        name1.main(str1);
        name1.print();
        Myinterface.staprint();
        System.out.println(Myinterface.num);
        //匿名内部类
        Myinterface fifth = () -> System.out.println("this is one");
        fifth.print2();
        fifth.print();

    }
}
