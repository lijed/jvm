/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.link.prepare;

/**
 * @author Administrator
 * @date 2020/12/8 22:01
 * Project Name: jvm
 */
public class Demo2 {
    int c;
    public static void main(String[] args) {
        int i;

        // 编译通不过，因为局部变量没有赋值不能被使用
//        System.out.println("i = " + i);
    }
}
