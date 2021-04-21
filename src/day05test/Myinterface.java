package day05test;

public interface Myinterface {
    public static final int num = 10;
    public default void print(){
        System.out.println("默认方法使用了");
    }
    public static void staprint(){
        System.out.println("静态方法可以直接使用");
    }
    public abstract void print2();

}
