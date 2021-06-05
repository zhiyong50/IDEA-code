package com.java28.day07.lianxi;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-09 11:15
 * @Desc：
 **/
public class HashMapDemo {
    public static void main(String[] args){
        Map<String,String> map=new HashMap<>();
        map.put("sex","男");
        map.put("id","1");
        map.put("mobile_phone","13212312312");
        map.put("pwd","12312312");
        map.put("pwd","5454");
        System.out.println(map);
        System.out.println(map.containsKey("mobile_phone"));
        System.out.println(map.get("mobile_phone"));
        map.replace("pwd","88888888");
        System.out.println(map);
    }
}
