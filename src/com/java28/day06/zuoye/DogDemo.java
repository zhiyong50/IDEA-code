package com.java28.day06.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-03 21:52
 * @Desc：
 **/
public class DogDemo extends ZooDemo {
    @Override  //注解，判断当前方法是否重写
    public void sleep(){
        System.out.println("吃饭睡觉打豆豆");
//        super.eat();  一般情况下只有在重写时才必须用super
        System.out.println("我累了，不要打扰我");
    }
    public void look(){
        System.out.println("我是人类忠诚的朋友，会守护你");
    }
}
