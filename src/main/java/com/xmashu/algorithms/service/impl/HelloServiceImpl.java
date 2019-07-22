package com.xmashu.algorithms.service.impl;

import com.xmashu.algorithms.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: wei.hu
 * @CreateDate: 2019/7/22
 */
@Service
public class HelloServiceImpl implements HelloService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String sayHello(String name) {
        String result = "hello "+name;
        logger.info(result);
        return result;
    }
}
