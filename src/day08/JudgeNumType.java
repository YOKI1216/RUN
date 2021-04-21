package day08;

public class JudgeNumType {

    public static void main(String[] args) {

        double num = 123.456;
        int i =0;
        Object object = i;
        System.out.println(object.getClass());
        judge(num);

    }
    public static void judge(int a){
        System.out.println("这是一个int类型的数据");
    }
    public static void judge(float a){
        System.out.println("这是一个float类型的数据");
    }
    public static void judge(double a){
        System.out.println("这是一个double类型的数据");
    }
    public static void judge(char a){
        System.out.println("这是一个char类型的数据");
    }
    public static void judge(byte a){
        System.out.println("这是一个byte类型的数据");
    }
    public static void judge(boolean a){
        System.out.println("这是一个boolean类型的数据");
    }
    public static void judge(long a){
        System.out.println("这是一个long类型的数据");
    }
}
