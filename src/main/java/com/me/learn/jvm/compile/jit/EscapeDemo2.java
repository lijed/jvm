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
 * @date 2020/12/27 16:00
 * Project Name: jvm
 */
public class EscapeDemo2 {
    /**
     *
     *  -Xmx20M -Xms20M -XX:-DoEscapeAnalysis
     *
     *  默认是开启逃逸分析
     * */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (long i = 0; i < 500000000; i++) {
            createObject();
        }
        System.out.println("cost=" + (System.currentTimeMillis()-start)/1000);
    }

    private static void createObject() {
        synchronized (EscapeDemo2.class) {
            new Object();
        }
    }
}
