/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.runtimearea.heap;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author Administrator
 * @date 2020/12/12 16:56
 * Project Name: jvm
 */
public class Worker {
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void printf(Worker p) {
// 查看对象的整体结构信息
// JOL工具类
        System.out.println(ClassLayout.parseInstance(p).toPrintable());
    }
}
