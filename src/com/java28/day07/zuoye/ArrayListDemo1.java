package com.java28.day07.zuoye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.OptionalDouble;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-08 23:02
 * @Desc：
 **/
public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList<Teacher> list =new ArrayList<>();
        Teacher t1=new Teacher("张三",25);
        Teacher t2=new Teacher("李四",35);
        Teacher t3=new Teacher("老王",19);
        Teacher t4=new Teacher("赵六",29);
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        System.out.println(list);
        System.out.println("=============");
        //普通for循环
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("============");
        //增强for循环
        for(Teacher e:list){
            System.out.println(e);
        }
        //迭代器
//        System.out.println("============");
//        Iterator<Teacher> it = list.iterator();
//        while(it.hasNext()) {
//            Teacher element = it.next();
//            System.out.println(element);
//        }
        //求老师的平均年龄
        int sum=0;
        int avg=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i).getAge();
        }
        avg=sum/list.size();
        System.out.println("老师的平均成绩是："+avg);
    }
}
