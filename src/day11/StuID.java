package day11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StuID implements Runnable{
    //学生属性
    private  Map<String,Long> studentID = new LinkedHashMap<>();
    private  ArrayList<String> stuName = new ArrayList<>();
    private  ArrayList<Long> ID = new ArrayList<>();
    Object object = new Object();
    private int StuNum =10;
    @Override
    public void run() {
        StuID myself = new StuID();
        Set<Map.Entry<String,Long>> set = studentID.entrySet();
        while(StuNum>0){
            synchronized(object){
                if(StuNum>0){
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.getStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"线程执行   学生"+StuNum+"信息为");
                    StuNum--;


                    //遍历
                    for(Map.Entry<String,Long> name:set){
                    String name01 =name.getKey();
                    Long ID = name.getValue();
                    System.out.println("学生信息"+name01+"\t"+ID);
                    }
                }
            }
        }


    }


    //setter getter
    public Map<String, Long> getStudentID() {
        return studentID;
    }

    public void setStudentID(Map<String, Long> studentID) {
        this.studentID = studentID;

    }

    public ArrayList<String> getStuName() {
        return stuName;
    }

    public void setStuName(ArrayList<String> stuName) {
        this.stuName = stuName;
        System.out.println("学生姓名导入成功");
    }

    public ArrayList<Long> getID() {
        return ID;
    }

    public void setID(ArrayList<Long> ID) {
        this.ID = ID;

        System.out.println("ID导入成功");
    }


}
