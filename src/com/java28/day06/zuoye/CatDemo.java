package com.java28.day06.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-03 21:47
 * @Desc：
 **/
public class CatDemo extends ZooDemo {
    @Override  //注解，判断当前方法是否重写
    public void eat(){
        System.out.println("我是干饭人1号");
//        super.eat();  一般情况下只有在重写时才必须用super
        System.out.println("我会吃老鼠");
    }
    public void pick(){
        System.out.println("我不仅会卖萌还会抓老鼠");
    }
}
