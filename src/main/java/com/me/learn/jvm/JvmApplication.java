/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 * @date 2020/12/26 6:49
 * Project Name: jvm
 */
@SpringBootApplication
public class JvmApplication {
    public static void main(String[] args) {
        {
            SpringApplication.run(JvmApplication.class, args);
        }
    }
}
