package com.java28.day05.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-01 14:30
 * @Desc： 第一题
 **/
public class Student {
    private String name;
    private int age;
    private int score=88;
    public Student(){
        System.out.println("Student的空参构造");
    }
    public Student(String name,int age,int score){
        System.out.println("Student的有参构造");
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age<=15){
            System.out.println("您输入的年龄无效！");
            this.age=15;
        }
        else{
            this.age=age;
        }
    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(score);
    }
}
