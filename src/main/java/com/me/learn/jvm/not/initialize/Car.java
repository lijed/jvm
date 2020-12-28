/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.not.initialize;

/**
 * @author Administrator
 * @date 2020/12/8 22:29
 * Project Name: jvm
 */
public class Car extends Vihicle {
    public static String name;
    public static final int age = 4;

    static {
        name = "car";
        System.out.println("Car is intializing");
    }


    public static void printInfo(){
        Vihicle.print();
        System.out.println("Car XXX");
    }

    public void run(){
        System.out.println("Vicle run");
    }



}
