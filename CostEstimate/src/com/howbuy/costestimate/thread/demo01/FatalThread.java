package com.howbuy.costestimate.thread.demo01;

public class FatalThread extends Thread
{
    public void run()
    {
        int i = 0;
        while (true)
        {
            try
            {
                if (i == 1000)
                {
                    i = 0;
                    throw new NullPointerException("encount unknown exception.");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
            i++;
        }
    }
    
    public static void main(String[] args)
    {
        new FatalThread().start();
    }
}
