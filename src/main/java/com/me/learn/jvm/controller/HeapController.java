/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.controller;

import com.me.learn.jvm.runtimearea.heap.Worker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2020/12/27 13:14
 * Project Name: jvm
 */
@RestController
public class HeapController {
    List<Worker> list = new ArrayList<>();


    /**
     * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=heap.hprof
     * @return
     */
    @GetMapping("/heap")
    public String heap() {
        while (true) {
            Worker worker = new Worker();
            list.add(worker);
        }
    }

}
