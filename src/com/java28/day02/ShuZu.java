package com.java28.day02;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-03-25 15:01
 * @Desc： 作业
 **/
public class ShuZu {
    public static void main(String[] args){
        //一维数组的创建
        int[] i1={100,200,300,400,500}; //语法一，静态初始化
        int[] i2= new int[5]; //语法二，动态初始化
        i2[0]=100;
        i2[1]=200;
        i2[2]=300;
        i2[3]=400;
        i2[4]=500;
        //二位数组的创建
        String[][] str1={{"java","html"},{"css","javascript"}};//方法一，静态初始化
        String[][] str2= new String[2][2];//方法二，动态初始化
        str2[0][0]="java";
        str2[0][1]="html";
        str2[1][0]="css";
        str2[1][1]="javascript";
//      System.out.println(i1.length);
//      System.out.println(str1.length);
//      System.out.println(i1[3]);
//      System.out.println(i2[1]);
//      System.out.println(str1[1][0]);
//      System.out.println(str2[0][0]);
        //第2题
        int x=1;
        int y=2;
        System.out.println(x/y);//结果为0，因为整数相除的结果是整数
        System.out.println(y/x);//结果为2，因为2除以1刚好能够整除
        System.out.println(x%y);//结果为1，因为1除以2取余数，余数为1
        System.out.println(y%x);//结果为0，因为2除以1取余数，余数为0
    }
}
