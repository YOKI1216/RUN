package day11;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class day11MainCode {
    public static void main(String[] args) {
        //对象
        StuID input = new StuID();

        ArrayList<Long> ID = new ArrayList<>();
        //学生ID导入
        ID.add(202010089191L);
        ID.add(202010089192L);
        ID.add(202010089193L);
        input.setID(ID);
        //学生姓名导入
        ArrayList<String> stuName = new ArrayList<>();
        stuName.add("张三");
        stuName.add("李四");
        stuName.add("王五");
        input.setStuName(stuName);

        //学生ID绑定
        Map<String,Long> studentID = new HashMap<>();
        for (int i = 0; i < stuName.size(); i++) {
            studentID.put(stuName.get(i),ID.get(i));
        }
        input.setStudentID(studentID);

        //使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<String, Long>> set = input.getStudentID().entrySet();
        //创建一个迭代器
        Iterator<Map.Entry<String,Long>> print = set.iterator();

        System.out.println("-----------------------------");

        //迭代器遍历
        while(print.hasNext()){
            Map.Entry<String,Long> entry =  print.next();
            String stro1 = entry.getKey();
            Long ID01 = entry.getValue();
            System.out.println(stro1+"="+ID01);
        }
        System.out.println("-----------------------------");
        //增强for循环遍历

        for(Map.Entry<String,Long> entry:set){
            String stro1 = entry.getKey();
            Long ID01 = entry.getValue();
            System.out.println(stro1+"  "+ID01);
        }
        System.out.println("-----------------------------");
        //创建线程任务
        Thread start01 = new Thread(input);
        Thread start02 = new Thread(input);
        Thread start03 = new Thread(input);
/*        //线程执行
        start01.start();
        start02.start();
        start03.start();*/

        //线程池创建
        ExecutorService pool = Executors.newFixedThreadPool(100);
        pool.submit(start01);
//        pool.submit(start02);
        pool.submit(start03);

        pool.shutdown();

        }
    }



