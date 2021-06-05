package com.java28.day06.lianxi;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-08 20:42
 * @Desc：
 **/
public class StringDemo {
    public static void main(String[] args){
        String str1="abc";
        String str2="ABC";
        //System.out.println(str1.equals(str2));//比较两个值，对大小写敏感
        //System.out.println(str1.equalsIgnoreCase(str2));//大小写不敏感
        String str="abc123nddda";
//        String newstr=str.replace("123","789");
//        System.out.println(str);
//        System.out.println(newstr);
//        System.out.println(str.length());
//        System.out.println(str.contains("acd"));
//        System.out.println(str.indexOf("a"));
//        System.out.println(str.lastIndexOf("a"));
//        String s="";
//        System.out.println(s.isEmpty());
//        String s="1,2,3,4,5";
//        String[] arr=s.split(",");
//        for(String s3:arr){
//            System.out.println(s3);
//        }
        String s="adasd123";
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,3));
    }
}
