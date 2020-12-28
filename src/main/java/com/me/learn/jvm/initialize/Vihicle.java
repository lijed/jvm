/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.initialize;

/**
 * @author Administrator
 * @date 2020/12/8 22:27
 * Project Name: jvm
 */
public class Vihicle {
    private static String category;

    static {
        category = "Vihicle";
        System.out.println("Vihicle initializing");
    }

    public static void print(){
        System.out.println("Vicle");
    }

}
