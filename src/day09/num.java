package day09;

public class num {
    public static  String str = "这是一个外部类的字符串";
    public static void main(String[] args) {
        System.out.println("这是一个外部类的主方法");
        num one = new num();
        //方法一
        num.num_1 two = one.new num_1();
        //使用
        two.main(args);
        System.out.println(str);
        System.out.println(two.str);
        System.out.println("=========================================");
        //方法二
        num.num_1 third = one.getclass();
        //使用
        third.main(args);
        System.out.println(str);
        System.out.println(third.str);

        System.out.println("=========================");
        day09MainCode noname = new day09MainCode(){
            public void print(){
                System.out.println("匿名内部类");
            }
        };


    }
    public class num_1{
        public  String str = "这是一个内部类的字符串";
        public void main(String[] args) {
            System.out.println("这是一个内部类的主方法");
        }



    }
    public num_1 getclass(){
        return new num_1();
    }
}
