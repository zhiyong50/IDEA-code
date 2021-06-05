package com.java28.day03.xunhuan;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-03-27 10:47
 * @Desc： 作业3等边三角形
 **/
public class SanJiaoXing {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){         //控制行数
            for(int j=1;j<=5-i;j++){
                System.out.print(" "); //输出空格，随着循环而递减
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");//*号后面加空格
            }
            System.out.println();
        }
    }
}
