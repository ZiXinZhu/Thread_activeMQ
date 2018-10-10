package com.zzx.activemq.threadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/17 14:18
 */
public class Delete extends Thread {
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {

        lock.lock();
        try {
            for(long i=0;i<1000;i++){
                System.out.println(i+"a");

            }
        }finally {
            lock.unlock();
        }

    }
}
