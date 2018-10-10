package com.zzx.activemq.threadpool;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/17 15:46
 */
public class TaskRun implements Runnable {
    @Override
    public void run() {
        System.out.println("run()方法被自动调用,干活！！！             " + Thread.currentThread().getName());
    }
}
