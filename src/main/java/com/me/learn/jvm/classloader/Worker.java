/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.classloader;

/**
 * @author Administrator
 * @date 2020/12/8 22:57
 * Project Name: jvm
 */
public class Worker {
    public static void main(String[] args) {
        System.out.println(new Worker().getClass().getClassLoader());
        System.out.println(new Worker().getClass().getClassLoader().getParent());
        System.out.println(new Worker().getClass().getClassLoader().getParent().getParent());
        System.out.println(new String().getClass().getClassLoader());
    }
}
