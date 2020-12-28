/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.not.initialize;

/**
 * @author Administrator
 * @date 2020/12/8 22:49
 * Project Name: jvm
 */
public class PassiveReferrenceTest {
    public static void main(String[] args) {
        //引用父类的静态字段，只会引起父类的初始化，而不会引起子类的初始化。
//        System.out.println(Car.category);

//        定义类数组，不会引起类的初始化。
//        Car[] carArray = new Car[10];
//        System.out.println(carArray.getClass());

        //引用类的static final常量，不会引起类的初始化
        System.out.println(Car.age);
    }
}
