package com.java28.day07.lianxi;

import java.util.HashSet;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-09 10:12
 * @Desc：
 **/
public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> set=new HashSet<>();
        set.add("12");
        set.add("45");
        set.add("21");
        set.add("123");
        set.add("45");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.remove("123"));
        System.out.println(set);
        System.out.println(set.contains("d21"));
        Object[] i=set.toArray();
        System.out.println(i[0]);
    }
}
