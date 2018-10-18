package com.zzx.activemq.threads;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/17 9:51
 */
public class MoreThread implements Runnable {
    String name;

    public MoreThread() {
    }

    public MoreThread(String name) {
        this.name = name;
    }

    /**
     * 线程上锁synchronized(两种上锁方式)
     */

    @Override
    public  void run() {
              synchronized(this) {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + name);
        }
           }

    }


    public static void main(String[] args) {
        MoreThread moreThread=new MoreThread("锁");
        Thread thread=new Thread(moreThread,"zzx--");
        thread.start();
        Thread thread1=new Thread(moreThread,"珠海了------");
        thread1.start();
        new Thread(){
            public void run(){
                System.out.println("哈哈哈");

            }
        }.start();
    }




}
