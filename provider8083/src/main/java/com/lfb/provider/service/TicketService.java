package com.lfb.provider.service;

import org.springframework.stereotype.Service;

/**
 * @Author:lfb
 * @Version:V1.0
 * @CreateTime:2019/7/1 20:35
 * @Description:
 */
@Service
public class TicketService {

    public String getTicket() {
        System.out.println("8083");
        return "《helloworld3》";
    }

}
