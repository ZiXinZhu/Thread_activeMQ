package com.zzx.activemq.threadpool;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/17 15:45
 */
public class TaskCall implements Callable {
    private int id;

    public TaskCall(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        System.out.println("call()方法被自动调用,干活！！！             " + Thread.currentThread().getName());
        if (new Random().nextBoolean())
            throw new TaskException("Meet error in task." + Thread.currentThread().getName());
        // 一个模拟耗时的操作
        for (int i = 999999999; i > 0; i--);

        return "call()方法被自动调用，任务的结果是：" + id + "    " + Thread.currentThread().getName();
    }
}


