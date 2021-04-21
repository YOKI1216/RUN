package day10;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    static ArrayList<String> list = new ArrayList();
    public static void main(String[] args) {
        Collection Interator = new Collection();
        list.add("这是一个字符串01");
        System.out.println(Interator.list.size());//Collection对象size方法
        Iterator<String> name01 = list.iterator();
        while(name01.hasNext()){
            System.out.println(name01.next());
        }//迭代器iterator的基础使用
        generic generic = new generic();
        System.out.println();

    }
    //使用泛型的内部类
    public static class generic<str>{
        private str name;

        public str getName() {
            return name;
        }

        public void setName(str name) {
            this.name = name;
        }
    }

    public static ArrayList arrayList(ArrayList arrayList){
        return arrayList;
    }

    public static int changMethod(int...num){
        int sum = 0;
        return sum;
    }

}
