package day03;

public class day03String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("使用空参构造"+str1);
        char[] charArray ={'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("使用字符数组构造"+str2);
        byte[] byteArra={23,32,34,45,65,3,65,5,56};
        String str3 = new String(byteArra);
        System.out.println("使用byte数组构造"+str3);
        String str = "直接创建";
        System.out.println(str);
        System.out.println("双引号里就是字符串对象编译器自动生成");
    }
}
