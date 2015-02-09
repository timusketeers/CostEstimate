package com.howbuy.costestimate.memory;

import java.util.ArrayList;
import java.util.List;

import com.howbuy.costestimate.memory.entity.BpFundBasicInfo;

public class MemoryCost
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();
        long m1 = runtime.freeMemory();
        List<BpFundBasicInfo> list = new ArrayList<BpFundBasicInfo>();
        for (int i = 0; i < 600000; i++)
        {
            BpFundBasicInfo info = new BpFundBasicInfo();
            info.setFundCode("" + (i + 1));
            info.setFundName("test" + (i + 1));
            list.add(info);
        }

        long m2 = runtime.freeMemory();

        long used = (m2 - m1) / (1024 * 1024);// 从计算结果中可以看出60万的记录大概消�?40M的内�?
        System.out.println(used);
    }
}
