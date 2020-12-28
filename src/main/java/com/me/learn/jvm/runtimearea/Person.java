/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.runtimearea;

/**
 * @author Administrator
 * @date 2020/12/12 16:17
 * Project Name: jvm
 */
public class Person {
    private String name="Jed";
    private int age;
    private final double salary=100;
    private static String address;
    private final static String hobby="programming";
    private static Object obj = new Object();
    public void say() {
        System.out.println("person say");
    }

    public static  int calc(int op1, int op2) {
        op1 = 3;
        int result = op1 + op2;
        Object object = new Object();
        return result;
    }

    public static void main(String[] args) {
        calc(1, 2);
    }
}
