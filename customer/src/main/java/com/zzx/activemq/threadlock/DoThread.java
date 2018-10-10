package com.zzx.activemq.threadlock;

/**
 * Created with IntelliJ IDEA.
 * Created by:  Vivian
 * Date: 2018/7/17 14:22
 */
public class DoThread extends Thread {

    public static void main(String[] args) {
        Count count = new Count();
        count.start();
        Delete delete = new Delete();
        delete.start();
        long start = System.currentTimeMillis();
        for (;;) {
            if (System.currentTimeMillis() - start > 10) {
                System.out.println("不用再等了！中断！");
                delete.stop();
                break;
            }
        }



    }



}
