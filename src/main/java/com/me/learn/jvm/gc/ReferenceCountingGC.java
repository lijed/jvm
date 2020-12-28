/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.gc;

/**
 * @author Administrator
 * @date 2020/12/15 6:34
 * Project Name: jvm
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 *1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static  void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        //Object a and b 能够被回收
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}
