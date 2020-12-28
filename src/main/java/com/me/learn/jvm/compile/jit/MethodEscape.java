/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.compile.jit;

import com.me.learn.jvm.runtimearea.heap.Worker;
import com.sun.corba.se.spi.orbutil.threadpool.Work;

/**
 * @author Administrator
 * @date 2020/12/27 15:50
 * Project Name: jvm
 */
public class MethodEscape {

    /***
     *  Workers 作用域放大了
     */
    public Worker doSomething() {
        Worker worker = new Worker();
        worker.getId();
        return worker;
    }

    public void doSomething2() {
        Worker worker = new Worker();
        worker.getId();
        //...
    }

    public void doSomething4() {
        Worker worker = new Worker();
        worker.setId(1);
        worker.setUsername("jed");

        //...

        int id = worker.getId();
        String name = worker.getUsername();

        //基本数据类型就是标量
        //Workder就是聚合量
    }

    public static void main(String[] args) {

    }
}
