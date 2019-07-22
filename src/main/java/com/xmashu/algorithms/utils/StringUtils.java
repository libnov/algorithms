package com.xmashu.algorithms.utils;

import java.util.UUID;

/**
 * @Author: wei.hu
 * @CreateDate: 2019/7/22
 */
public abstract class StringUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
