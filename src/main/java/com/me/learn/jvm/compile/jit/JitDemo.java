/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.compile.jit;

/**
 * @author Administrator
 * @date 2020/12/26 23:32
 * Project Name: jvm
 */
public class JitDemo {
    private static final int num = 1500;
    public static int doubleValue(int i) {
        return i * 2;
    }

    public static long calctNum() {
        long sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += doubleValue(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        for (int i = 0; i < num; i++) {
            calctNum();
        }
    }
}
