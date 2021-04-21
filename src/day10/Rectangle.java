package day10;

public class Rectangle {
    private static int length;
    private static int wide;
    public static void main(String[] args) {
        Rectangle object = new Rectangle();//创建方法
        setLength(5);//长度设定值
        setWide(4);//宽设定
        System.out.println(object.getGirth(getLength(),getWide()));//打印周长
        setWide(3);//更改宽的数值
        System.out.println(object.getArea(getLength(),getWide()));//打印面积
    }
    int getArea(int length,int wide){
        int area = length*wide;
        return area;
    }
    int getGirth(int length,int wide){
        int girth = 2*(length+wide);
        return girth;
    }

        //构造方法
    public Rectangle() {
    }
    //setter getter方法
    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        Rectangle.length = length;
    }

    public static int getWide() {
        return wide;
    }

    public static void setWide(int wide) {
        Rectangle.wide = wide;
    }
}
