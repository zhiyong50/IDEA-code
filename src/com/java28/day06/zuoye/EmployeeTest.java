package com.java28.day06.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-03 23:03
 * @Desc： 第二题
 **/
public class EmployeeTest {
    public static void main(String[] args){
        Employee c1=new Coder();
        Employee c2=new Tester();
        Employee c3=new Manager();
        method(c1);
        method(c2);
        method(c3);
//        Employee c=new Coder();
//        多态：用父类的类型来接收子类的对象,调用父类所有的方法
//        多态特点：不能直接调用子类的方法，但可以间接调用
//        强转就行，比如：Coder co=(Coder)Employee
    }
    public static void method(Employee c){
        c.sleep();
        c.work();
    }
}
