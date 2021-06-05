package com.java28.day05.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-01 22:55
 * @Desc：
 **/
public class ArrayTest {
    public static void main(String[] args){
        FunctionDemo3 fun=new FunctionDemo3();
        int [] calssA= {65,40,66,80,90,100,45,59};
        int [] classB= {60,40,68,80,95,38,45,59};
        int [] classC= {60,30,68,58,93,28,45,59};
        System.out.println("A班及格的人数是："+fun.func(calssA));
        System.out.println("B班及格的人数是："+fun.func(classB));
        System.out.println("C班及格的人数是："+fun.func(classC));
    }
}
