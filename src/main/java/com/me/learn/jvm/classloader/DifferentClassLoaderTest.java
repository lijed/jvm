/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.classloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Administrator
 * @date 2020/12/7 21:33
 * Project Name: jvm
 */
public class DifferentClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                InputStream stream = getClass().getResourceAsStream(fileName);
                if (stream == null) {
                    return super.loadClass(name);
                }
                try {
                    byte[] b = new byte[stream.available()];
                    // 将流写入字节数组b中
                    stream.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return super.loadClass(name);
            }
        };
        Object obj = classLoader.loadClass("com.me.learn.jvm.classloader.DifferentClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println("obj's classs: classloader:" + obj.getClass().getClassLoader().getClass());
        System.out.println("DifferentClassLoaderTest classloader:" +DifferentClassLoaderTest.class.getClassLoader().getClass());
        System.out.println(obj instanceof DifferentClassLoaderTest);
    }
}
