package com.lfb.provider;

import com.lfb.provider.service.TicketService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Author:lfb
 * @Version:V1.0
 * @CreateTime:2019/7/1 20:41
 * @Description:
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping (value = "/ticket",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fallbackMethod_getTicket")
    public String getTicket() {
//        if(a==1) {
//            throw new RuntimeException("ssss");
//        }
        return ticketService.getTicket();
    }

    public String fallbackMethod_getTicket() {
        return "服务异常";
    }
}
