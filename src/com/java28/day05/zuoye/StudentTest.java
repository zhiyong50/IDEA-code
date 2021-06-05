package com.java28.day05.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-01 21:01
 * @Desc：
 **/
public class StudentTest {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student("张三",16,66);
        s1.setName("小明");
        s1.setAge(38);
        s1.show();
    }
}
