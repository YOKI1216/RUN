package day05test;

import java.util.HashSet;
import java.util.Random;

public class Test03 {


    //使用HashSet类随机产生10个不重复的1到20的不重复随机数
        public static void main(String[] args) {
            Random r=new Random();

            HashSet<Integer> hs=new HashSet<Integer>();

            while(hs.size()<80) {
                hs.add((r.nextInt(50)+1));
            }
            for(Integer i:hs) {
                System.out.print(i+" ");
            }


        }
}

