package com.java28.day03.xunhuan;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-03-27 10:14
 * @Desc： 作业2
 **/
public class SumDemo {
    public static void main(String[] args){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<=100;i++) {
            if (i%2==0) {
                sum1=sum1+i;//求0到100之间所有的偶数和
            }
            else{
                sum2=sum2+i;//求0到100之间所有的奇数和
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}


