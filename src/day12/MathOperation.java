package day12;

public class MathOperation {
    private int num1;
    private int num2;

    public static void main(String[] args) {
        MathOperation operation = new MathOperation();
        //赋值
        operation.setNum1(5);
        operation.setNum2(21);
        //和 差 乘 方法调用
        int sum = operation.getSum(operation.getNum1(), operation.getNum2());
        int reduce = operation.getReduce(operation.getNum1(), operation.getNum2());
        int ride =  operation.getRide(operation.getNum1(), operation.getNum2());
        //输出
        System.out.println("和的值为"+sum);
        System.out.println("差的值为"+reduce);
        System.out.println("乘的值为"+ride);

    }
    public int getSum(int a,int b){
        return a+b;
    }
    public int getRide(int a,int b){
        return a*b;
    }
    public int getReduce(int a,int b){
        return a-b;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
