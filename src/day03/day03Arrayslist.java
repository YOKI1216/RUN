package day03;

import java.util.ArrayList;
public class day03Arrayslist {
    private String name;
    private int age;
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("me");
        list.add("i");
        list.add("we");
        list.add("your");
        System.out.println(list);
        String name1 = list.get(1);//
        System.out.println(name1);
                String name2 = list.remove(1);
        System.out.println(name1);
        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        //从jdk1.5+支持自动开箱自动拆箱
        list1.add(100);
        list1.add(666);
        list1.add(999);
        System.out.println(list1);
        print(list);

    }
    public static void print(ArrayList list){
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1){
            System.out.print(list.get(i)+" "); }
            else{
                System.out.print("]");
            }
        }
    }

}
