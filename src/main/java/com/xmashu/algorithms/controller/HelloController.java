package com.xmashu.algorithms.controller;

import com.xmashu.algorithms.utils.DateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wei.hu
 * @CreateDate: 2019/7/21
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String,Object> hello(String name){
        Map<String,Object> data = new HashMap<>();
        data.put("time", DateUtils.currentTime());
        data.put("name",name);
        return data;

    }
}
