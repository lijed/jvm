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
 * @date 2020/12/15 20:39
 * Project Name: jvm
 */
public class MinorAndMajorGC {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM 参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     *
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseSerialGC
     *
     *   -Xmn10M -新生代 = eden + from survivor + to survivor
     */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB]; // 出现一次minor GC
    }

    /**
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:PretenureSizeThreshold=3145278
     */
    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }

    /**
     * VM 参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     *
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:MaxTensuringThreshold=1 -XX:+PrintTenuringDistribution
     *
     *   -Xmn10M -新生代 = eden + from survivor + to survivor
     */
    public static void testTenureThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB/4];
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }


    /**
     * VM 参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     *
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:MaxTensuringThreshold=1 -XX:+PrintTenuringDistribution
     *
     *   -Xmn10M -新生代 = eden + from survivor + to survivor
     *
     *   如果survivor空间中相同年龄所有对象的大小的总和大于survivor空间的一半，年龄大于或者等于该年龄的对象就会直接进入老年代
     */
    public static void testTenureThreshold2() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB/4];
        allocation2 = new byte[_1MB/4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4  = new byte[4 * _1MB];
    }

    /**
     * VM 参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     *
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:MaxTensuringThreshold=1
     * -XX:-HandlePromotionFailure
     *
     *   -Xmn10M -新生代 = eden + from survivor + to survivor
     *
     *   如果survivor空间中相同年龄所有对象的大小的总和大于survivor空间的一半，年龄大于或者等于该年龄的对象就会直接进入老年代
     */
    public static void testHandlePromotion() {
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6, allocation7;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation1 = null;
        allocation4 = new byte[2 * _1MB];
        allocation5  = new byte[2 * _1MB];
        allocation6  = new byte[2 * _1MB];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;

        allocation7 = new byte[2 * _1MB];
    }


    public static void main(String[] args) {
        testAllocation();

//        testPretenureSizeThreshold();
//
//        testTenureThreshold();
//
//        testTenureThreshold2();
    }
}
