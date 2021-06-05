package com.java28.day03.xunhuan;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-03-26 17:16
 * @Desc： 作业1
 **/
public class XunHuan {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){  //控制行数
            for(int j=1;j<=i;j++){   //控制列数
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
