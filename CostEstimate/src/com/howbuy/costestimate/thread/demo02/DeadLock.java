package com.howbuy.costestimate.thread.demo02;

/**
 * 死锁案例及使用jstack分析过程.
 * @author li.zhang
 * 2015-1-26
 *
 */
public class DeadLock
{

    public static void main(String[] args)
    {
        final Object obj_1 = new Object(), obj_2 = new Object();

        Thread t1 = new Thread("t1")
        {
            @Override
            public void run()
            {
                synchronized (obj_1)
                {
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException e)
                    {
                    }

                    synchronized (obj_2)
                    {
                        System.out.println("thread t1 done.");
                    }
                }
            }
        };

        Thread t2 = new Thread("t2")
        {
            @Override
            public void run()
            {
                synchronized (obj_2)
                {
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException e)
                    {
                    }

                    synchronized (obj_1)
                    {
                        System.out.println("thread t2 done.");
                    }
                }
            }
        };
        
        t1.start();
        t2.start();
    }
}