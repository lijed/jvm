/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.jvm.lock.deadLock;

import ch.qos.logback.core.util.TimeUtil;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @date 2020/12/26 7:29
 * Project Name: jvm
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Worker1());
        Thread th2 = new Thread(new Worker2());
        th1.start();
        th2.start();
    }



    static class Worker1 implements  Runnable {
        @Override
        public void run() {
            synchronized (Locks.lock1) {
                System.out.println(Thread.currentThread().getName() + " get the lock " + Locks.lock1);
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " is trying to get the lock " + Locks.lock2);
                synchronized (Locks.lock2) {
                    System.out.println(Thread.currentThread().getName() + " get the lock " + Locks.lock2);
                }
            }
        }
    }

    static class Worker2 implements  Runnable {
        @Override
        public void run() {
            synchronized (Locks.lock2) {
                System.out.println(Thread.currentThread().getName() + " get the lock " + Locks.lock2);
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " is trying to get the lock " + Locks.lock1);
                synchronized (Locks.lock1) {
                    System.out.println(Thread.currentThread().getName() + " get the lock " + Locks.lock1);
                }
            }
        }
    }


    static class Locks {
        private static final Object lock1 = new Object();
        private static final Object lock2 = new Object();
    }

}
