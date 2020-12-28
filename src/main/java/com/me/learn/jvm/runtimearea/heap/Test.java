/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.runtimearea.heap;

/**
 * @author Administrator
 * @date 2020/12/12 16:58
 * Project Name: jvm
 */
public class Test {
    public static void main(String[] args) {
        Worker work = new Worker();
        System.out.println("worker = " + work);
        Worker.printf(work);
        System.out.println(work.hashCode());
    }
}
