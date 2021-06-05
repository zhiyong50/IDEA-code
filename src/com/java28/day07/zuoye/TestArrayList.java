package com.java28.day07.zuoye;

import java.util.ArrayList;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-09 01:21
 * @Desc： 第2题
 **/
public class TestArrayList {
    public static void main(String[] args){
//        //第1种方法
//        ArrayList<String> list=new ArrayList<>();
//        String[] str1={"abc","123","中国","llllll","haha"};
//        list.add("abc");
//        list.add("123");
//        list.add("中国");
//        list.add("llllll");
//        list.add("haha");
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i)+":"+str1[i].length());
//        }
        //第2种方法
        String s="abc,123,中国,llllll,haha";
        String[] arr=s.split(",");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+":"+arr[i].length()+",");
            if(i== arr.length-1){
                System.out.print(arr[i]+":"+arr[i].length());
            }
        }
    }
}
