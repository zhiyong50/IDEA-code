package com.java28.day04;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-03-30 21:47
 * @Desc：
 **/
public class CarTest {
    public static void main(String[] args){
        Car c1=new Car();
        c1.yanse="白色";
        c1.chelun="4个";
        c1.pinpai="宝马X3";
        c1.start();
        c1.end();
        System.out.println(c1.yanse+c1.chelun+c1.pinpai);
        System.out.println("============");
        Car c2=new Car();
        c2.yanse="黑色";
        c2.chelun="4个";
        c2.pinpai="奥迪Q5";
        c2.start();
        c2.end();
        System.out.print(c2.pinpai);
    }
}
