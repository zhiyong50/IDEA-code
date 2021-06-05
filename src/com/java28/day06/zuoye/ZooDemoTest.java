package com.java28.day06.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-03 22:28
 * @Desc：
 **/
public class ZooDemoTest {
    public static void main(String[] args) {
//        ZooDemo zoo=new ZooDemo();
//        CatDemo cat=new CatDemo();
//        DogDemo dog=new DogDemo();
//        zoo.eat();
//        cat.eat();
//        dog.sleep();
//    }
        //第二种方法
        ZooDemo zoo1 = new CatDemo();
        ZooDemo zoo2 = new DogDemo();
        CatDemo cat = (CatDemo) zoo1;
        DogDemo dog = (DogDemo) zoo2;
        zoo1.eat();
        zoo1.sleep();
        cat.pick();
        zoo2.eat();
        zoo2.sleep();
        dog.look();
    }
}
