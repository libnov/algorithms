package com.xmashu.algorithms.sort;

import com.xmashu.algorithms.utils.AlgorithmUtils;

import java.util.Arrays;

/**
 * 时间复杂度： O(n^2)
 * 思路： 遍历数组每个元素， 每次找出最小的元素，和当前元素进行交换
 * @Author: wei.hu
 * @CreateDate: 2019/7/22
 */
public class Alg_01_SelectSort {

    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort(int[] arr){
        int length = arr.length;
        for(int i=0;i<length;i++){
            int minIndex = i;

            // 从 i+1 开始找出 最小值的索引
            for(int j=i+1;j<length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            //将当前索引 i 的元素 和 最小值索引 minIndex 的元素进行交换
            AlgorithmUtils.swap(arr,i,minIndex);
        }
    }

}
