package Testwork;

import java.util.ArrayList;
import java.util.Scanner;

public interface Stu {
    public static void main(String[] args) {
        ArrayList<String> stu = new ArrayList();
        Scanner input = new Scanner(System.in);
        int stunum=10;
        String stuinformation;
        for (int i = 0; i < stunum; i++) {
            stuinformation = input.nextLine();
            stu.add(stuinformation);
        }



    }
}
