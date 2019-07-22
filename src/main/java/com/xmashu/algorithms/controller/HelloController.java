package com.xmashu.algorithms.controller;

import com.xmashu.algorithms.service.HelloService;
import com.xmashu.algorithms.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
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

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public Map<String,Object> hello(String name){
        Map<String,Object> data = new HashMap<>();
        data.put("time", DateUtils.currentTime());
        data.put("name",helloService.sayHello(name));

        logger.info(data.toString());

        return data;
    }


}
