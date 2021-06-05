package com.java28.day08.zuoye;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-10 15:30
 * @Desc： 第3题
 **/
public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Student,String> map=new HashMap<>();
        map.put(new Student("张三",25,"男"),"1801班");
        map.put(new Student("李四",26,"男"),"1801班");
        map.put(new Student("小华",27,"女"),"1801班");
        map.put(new Student("小明",28,"男"),"1802班");
        map.put(new Student("小红",29,"女"),"1802班");
        //使用keyset方法输出学生数据
        Set<Student> keySet1=map.keySet();
        for(Student key:keySet1){
            String value=map.get(key);
            System.out.println(key+"："+value);
        }
        System.out.println("==========");
        //使用entryset方法输出学生数据
        Set<Map.Entry<Student, String>> entrySet1 = map.entrySet();
        for(Map.Entry<Student, String> entry:entrySet1){
            System.out.println(entry.getKey()+"："+entry.getValue());
        }
        System.out.println("===========");
        //表达式方法输出学生成绩
//        map.forEach((k,v)->{
//            System.out.println(k+ "=" + v);
//        });
    }
}
