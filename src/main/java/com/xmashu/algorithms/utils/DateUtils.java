package com.xmashu.algorithms.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * @Author: wei.hu
 * @CreateDate: 2019/7/21
 */
public abstract class DateUtils {

    public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";

    public static String currentTime(){
        return DateFormatUtils.format(new Date(),DEFAULT_PATTERN);
    }
}
