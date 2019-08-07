package com.lfb.consumerfeign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author:lfb
 * @Version:V1.0
 * @CreateTime:2019/8/5 16:28
 * @Description:
 */
@Component
public class ConsumerServiceFallbackFactory implements FallbackFactory<ConsumerService> {
    @Override
    public ConsumerService create(Throwable throwable) {
        return new ConsumerService(){

            @Override
            public String getTicket() {
                return "服务异常";
            }
        };
    }
}
