package com.xmashu.algorithms.utils;

/**
 * @Author: wei.hu
 * @CreateDate: 2019/7/22
 */
public abstract class AlgorithmUtils {

    public static void swap(int[] arr, int i, int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
