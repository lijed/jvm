/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.initialize;

/**
 * @author Administrator
 * @date 2020/12/8 22:29
 * Project Name: jvm
 */
public class Car extends Vihicle {
    public static String name;
    private static final int age = 4;

    static {
        name = "car";
        System.out.println("Car is intializing");
    }


    public static void printInfo(){
        Vihicle.print();
        System.out.println("Car XXX");
    }

    public void run(){
        System.out.println("Vicle run");
    }

    public static void main(String[] args) {
         //1. 创建类的实例，也就是new的方式
         //new Car().run();

        //2. 调用某个类或者接口的静态变量，或者对该静态变量赋值
//        System.out.println(Car.name);

        //3 调用某个类的静态方法
//        Car.printInfo();

        //4. Reflect
//        try {
//            Class.forName(Car.class.getName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        //5. 初始化某个类的子类，则其父类也会被初始化

        //6 main
        System.out.println(1);
    }


}
