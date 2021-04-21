package day01;

public class day01base {
    public static void main(String[] args) {
        System.out.println("这是冲刺学习的第一天");

        getresult();
        Array();

    }
    public static void getresult(){
        int sum=0;
        for(int i=1;i<100;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void Array() {
        int ArrayA[]={10,1,654,56,454,54,64,64,4,6};
        for(int i=0;i< ArrayA.length;i++){
            System.out.print(ArrayA[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println("==================");
        System.out.println(ArrayA);
        //结果为[I@1540e19d
        System.out.println("打印出来的是内存哈希值");
        System.out.println("内存哈希值和内存地址值不是同一个东西");
    }
}
