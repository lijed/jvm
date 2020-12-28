/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.runtimearea;

/**
 * @author Administrator
 * @date 2020/12/11 21:25
 * Project Name: jvm
 */
public class Stack {

    //-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -Xlog:gc* -XX:+UseSerialGC
    // -Xmn 是新生代推空间
//    -verbose:gc
//-Xms20M
//-Xmx20M
//-Xmn10M
//-XX:SurvivorRatio=8
//            -Xlog:gc*
//            -XX:+UseSerialGC
//-XX:+PrintFlagsFinal
//-XX:+HeapDumpOnOutOfMemoryError
    public static void main(String[] args) {
        //allocate 64M Byte space
        byte[] placeholder = new byte[64*1024*1024];
        System.gc();
    }
}
