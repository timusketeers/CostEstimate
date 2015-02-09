package com.howbuy.costestimate.thread.demo01;

public class FatalThread2 extends Thread
{
    public void run()
    {
        int i = 0;
        while (true)
        {
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
        new FatalThread2().start();
    }
}
