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
 * @date 2020/12/8 22:20
 * Project Name: jvm
 */
public class StateFieldIntializeDemo1 {
    private static  String name = "Li";
    static {
        name = "jed";
    }

    public static void main(String[] args) {
        System.out.println("name = " + name);
    }
}
