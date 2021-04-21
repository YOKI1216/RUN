package day03;

import java.util.ArrayList;
import java.util.Random;

public class day03protect {
    public static void main(String[] args) {
        int min=50,max=100;
        Random random = new Random();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            num.add(random.nextInt(max)%min+min);
        }
        System.out.println(num);
        ArrayList<Name> student = new ArrayList<>();
        Name one =new Name("小红", 13);
        Name two =new Name("小红", 13);
        Name third =new Name("小红", 13);
        Name four =new Name("小红", 13);
        student.add(one);
        student.add(two);
        student.add(third);
        student.add(four);
        for (int i = 0; i < student.size(); i++) {
            Name stu = student.get(i);
            System.out.println(stu.getName()+stu.getAge());
        }
        System.out.println(student);

    }
}
