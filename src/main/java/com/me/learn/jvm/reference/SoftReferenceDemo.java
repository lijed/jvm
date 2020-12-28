/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.reference;

import com.me.learn.jvm.runtimearea.heap.Worker;

import java.lang.ref.SoftReference;

/**
 * @author Administrator
 * @date 2020/12/13 23:18
 * Project Name: jvm
 */
public class SoftReferenceDemo {

    public static void main(String[] args) {
        //。。。一堆业务代码
        Worker a = new Worker();

        //。。业务代码使用到了我们的Worker实例

        // 使用完了a，将它设置为soft 引用类型，并且释放强引用；
        SoftReference<Worker> sr = new SoftReference<>(a);
        a = null;

        if (sr != null) {
            a = sr.get();
        } else {
            // GC由于内存资源不足，可能系统已回收了a的软引用，
            // 因此需要重新装载。
            a = new Worker();
            sr = new SoftReference<>(a);
        }
    }
}
