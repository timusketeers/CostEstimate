package com.howbuy.costestimate.thread.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 运行结果分析:
 * 
 *    程序只能打印到1000就结束了，并不能像我想象中的那样----当当前线程异常退出的时候,由线程池中的另一个线程接管并继续执行因为异常退出而
 *    
 *    未能成功执行完成的线程。慎之慎之..
 *    
 * @author li.zhang
 * 2015-1-26
 *
 */
public class FatalThread3 implements Runnable
{
    public void run()
    {
        int i = 0;
        while (true)
        {
            System.out.println(Thread.currentThread().getId() + ":==========================" + i);
            if (i == 1000)
            {
                i = 0;
                
                /**
                 * 注意这种运行时异常，在抛出异常的时候不需要在外部方法声明抛出异常.
                 */
                throw new NullPointerException("encount unknown exception.");
            }
            
            i++;
        }
    }
    
    public static void main(String[] args)
    {
        ExecutorService ex = Executors.newFixedThreadPool(1);
        
        /**
         * 每submit一次，执行一次，如果在该次submit()提交任务后，该任务在执行过程中异常退出，该异常退出的任务不会再次被执行，
         * 
         * 我们只能再次重新submit()一个任务重新开始运行.
         */
        ex.submit(new FatalThread3());
        
        ex.submit(new FatalThread3());
    }
}
