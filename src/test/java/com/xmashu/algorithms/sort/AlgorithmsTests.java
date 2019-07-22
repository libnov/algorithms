package com.xmashu.algorithms.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @Author: wei.hu
 * @CreateDate: 2019/7/22
 */
public class AlgorithmsTests {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private long start;

    @Before
    public void before(){
        start = System.currentTimeMillis();
    }

    @After
    public void after(){
        long end = System.currentTimeMillis();
        logger.info("耗时：{} 毫秒",(end-start));
    }

    @Test
    public void testSelectSort(){
        int[] arr = new int[]{8,2,3,5,1,9,6,0,4,7};

        logger.info("选择排序前：{} ",Arrays.toString(arr));

        Alg_01_SelectSort.selectSort(arr);

        logger.info("选择排序后：{} ",Arrays.toString(arr));
    }
}
