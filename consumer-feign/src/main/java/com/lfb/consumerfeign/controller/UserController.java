package com.lfb.consumerfeign.controller;

import com.lfb.consumerfeign.service.ConsumerService;
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
    ConsumerService consumerService;

    @GetMapping("/buy")
    public String buy(String name) {
        return consumerService.getTicket();
    }

}
