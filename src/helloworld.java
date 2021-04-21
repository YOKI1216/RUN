
import java.io.UnsupportedEncodingException;

public class helloworld {
    public static void main(String[] args) throws UnsupportedEncodingException{
        String str="成功升级jdk9";
        str= new String(str.getBytes("gbk"),"utf-8");

    }
     /* 修饰符 class关键字 类名{
        成员变量
        成员方法
    }*/
    public static class newclass{
        //这是mian方法
        public static void main(String[] args) {
            System.out.println("这是一个代码块");
        }
    }
}
