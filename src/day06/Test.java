package day06;

public class Test {
    public static void main(String[] args) {

        Phone p1 = new Phone("大哥大",999.0);
        Phone p2 = new Phone("大哥大02",1000.0);

        //调用重写后的equals方法,p1和p2的name属性值相等，返回true
        boolean b = p1.equals(p2);
        //打印为true
        System.out.println(b);
    }

}
