package com.myprivate.myapi.juc;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 黄志强
 * @data 2018/11/6 11:02
 * ReentrantLock 的实现（重入锁）
 */

public class MyService {

    private Lock lock = new ReentrantLock();
    /**
     * 公平锁
     */
    private Lock lock1 = new ReentrantLock(true);
    /**
     * 不公平锁
     */
    private Lock lock2 = new ReentrantLock(false);

    /**
     * //创建Condition
     */
    private Condition condition = lock.newCondition();

    /**
     * 条件所
     */
    @Test
    public void testMethod() {
        try {
            lock.lock();//lock加锁
            //1：wait 方法等待：
            System.out.println("开始wait");
            //通过创建Condition对象来使线程wait，必须先执行lock.lock方法获得锁
            condition.await();
            condition.notify();
            //:2：signal方法唤醒
            condition.signal();//condition对象的signal方法可以唤醒wait线程
            System.out.println(" 已唤醒");
            for (int i = 0; i < 5; i++) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}
