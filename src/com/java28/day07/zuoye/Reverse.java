package com.java28.day07.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-09 01:04
 * @Desc： 第3题
 **/
public class Reverse {
    public static void main(String[] args){
        String str="aiwozhonghua";
        System.out.println("反转前："+str);
        System.out.print("反转后：");
        char[] arr=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
