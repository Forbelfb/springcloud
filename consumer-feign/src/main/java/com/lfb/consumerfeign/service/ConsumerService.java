package com.lfb.consumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author:lfb
 * @Version:V1.0
 * @CreateTime:2019/8/4 13:54
 * @Description:
 */
@FeignClient(value ="PROVIDER-TICKET",fallbackFactory = ConsumerServiceFallbackFactory.class)
public interface ConsumerService {

    @GetMapping("/ticket")
    public String getTicket();



}
