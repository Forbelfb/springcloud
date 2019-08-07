package com.lfb.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:lfb
 * @Version:V1.0
 * @CreateTime:2019/7/1 22:15
 * @Description:
 */
@RestController
public class UserController {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buy(String name) {
        String object = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name + "买了" + object;
    }

}
