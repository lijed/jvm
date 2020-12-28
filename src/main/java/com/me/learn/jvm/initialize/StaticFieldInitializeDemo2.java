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
 * @date 2020/12/8 22:22
 * Project Name: jvm
 */
public class StaticFieldInitializeDemo2 {
    // 打印结构和类变量和静态代码块的执行顺序有关
    static {
        name = "jed";
    }
    private static  String name = "Li";

    public static void main(String[] args) {
        System.out.println("name = " + name);
        // 最后输出：Li
    }
}
