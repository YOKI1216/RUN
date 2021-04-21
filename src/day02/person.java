package day02;

public class person {
    private static int age;
    String name;
    public static void show(){
        System.out.println(age);
    }
    public void setAge(int num){
    age = num;
    }
    public int getAge(){
        return age;
    }


}
