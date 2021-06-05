package com.java28.day04;
import java.util.Scanner;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-03-31 12:14
 * @Desc： 第3题
 **/
public class Computer {
    public void jiaFa(int a,int b){
        System.out.println("a+b="+(a+b));
    }
    public void jianFa(int a,int b){
        System.out.println("a-b="+(a-b));
    }
    public void chenFa(int a,int b){
        System.out.println("a*b="+(a*b));
    }
    public void chuFa(int a,int b){
        if(b==0){
            System.out.println("除数不为0，请重新输入");
        }else{
            System.out.println("a/b="+(a/b));
        }
    }
}
