package com.java28.day04;
import java.util.Scanner;
/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-03-31 12:35
 * @Desc：
 **/
public class CoumputerTest {
    public static void main(String[] args){
        Computer c1=new Computer();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b=sc.nextInt();
        System.out.println("请输入计算的方式：");
        char c=sc.next().charAt(0);
        if(c=='+'){
            c1.jiaFa(a,b);
        }else if(c=='-'){
            c1.jianFa(a,b);
        }else if(c=='*'){
            c1.chenFa(a,b);
        }else if(c=='/'){
            c1.chuFa(a,b);
        }
    }
}
