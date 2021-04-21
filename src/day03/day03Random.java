package day03;
import java.util.Random;
//random 随机数
//使用三步走
//导包、创建、使用
public class day03Random {
    public static void main(String[] args) {
        Random change = new Random();
        int i = change.nextInt();
        System.out.println("int类型随机数是"+i);
        //指定范围的随机数
        int num1 = change.nextInt(90);
        System.out.println(num1);
        int max=92;
        int min=90;
        Random random = new Random();
/*
    random.nextInt(max)表示生成[0,max]之间的随机数，然后对(max-min+1)取模。
   以生成[10,20]随机数为例，首先生成0-20的随机数，然后对(20-10+1)取模得到[0-10]之间的随机数，然后加上min=10，最后生成的是10-20的随机数
*/
        int s = random.nextInt(max)%(max-min+1) + min;
        System.out.println(s);
    }

}
