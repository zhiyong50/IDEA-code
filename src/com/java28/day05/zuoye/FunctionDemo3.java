package com.java28.day05.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 柠檬班Java28期
 * @Author: Administrator
 * @Create: 2021-04-01 22:45
 * @Desc： 第二题
 **/
public class FunctionDemo3 {
    public static int func(int [] clazz) {
        int sum = 0;
        for (int i = 0; i < clazz.length; i++) {
            int score = clazz[i];
            if (score >= 60) {
                sum++;
            }
        }
        return sum;
    }
}
