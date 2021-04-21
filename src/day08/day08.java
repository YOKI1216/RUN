package day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class day08 {

    static ArrayList<String> str = new ArrayList<>();
    static String a = "选择语句1";
    public static void main(String[] args)throws IOException {
        //时间计算
        System.out.println(new Date());
        //产生随机数
        Random unknow = new Random();
        int sum_1 = unknow.nextInt(3);
        arr(sum_1);//AarrayList集合数据处理
        System.out.println(sum_1);
        int num =100;
        double num1 =100.1;
        choose(num1);
        cheack();//检测
        /*switch (a){
            case "选择语句1":
                System.out.println(str.get(0));
                break;
            case "选择语句2":
                System.out.println(str.get(1));
                break;
            case "选择语句3":
                System.out.println(str.get(2));
                break;
            case "选择语句4":
                System.out.println(str.get(3));
                break;
            case "选择语句5":
                System.out.println(str.get(4));
                break;
        }*/
        boolean noname = true;
        do{
            noname =false;

            }while(noname);
        File file = new File("Myfile.txt");//创建文件
        file.createNewFile();
        on(file);
        in(file);

    }
    public  static void cheack(){
        System.out.println(str.get(0).length());
        System.out.println(str.size());
    }
    //输入流
    public static void on(File file){
        try {
            FileOutputStream out = new FileOutputStream(file,false);
            for (int i = 0; i < str.size(); i++) {
                out.write(str.get(i).getBytes());
                out.write("\n".getBytes());
            }
            out.close();
        }catch (IOException e){
            e.getMessage();
        }

    }
    //输出流
    public static void in(File file)throws IOException{
        FileInputStream in = new FileInputStream(file);
        byte[] bytes = in.readAllBytes();
        System.out.println(new String(bytes));
        in.close();
    }
    //集合ArrayList的字符串输入
    public static void arr(int num){
        Scanner input = new Scanner(System.in);
        str.add("It is first!");
        str.add("It is two!");
        str.add("It is third!");
        str.add("It is four");
        str.add(new String(String.valueOf(num)));
//        str.add(input.next());
    }

    public static void choose(int a){
        System.out.println("int");
    }
    public static void choose(double a){
        System.out.println("double");
    }


}
