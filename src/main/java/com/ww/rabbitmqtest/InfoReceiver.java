package com.ww.rabbitmqtest;

import com.ww.rabbitmqtest.message.LogInfoMsg;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "log.info")
public class InfoReceiver {
    @RabbitHandler
    public void receive(LogInfoMsg msg) {
        System.out.println("receive info msg:..............." + msg.getId()+","+msg.getName()+","+msg.getInfo());
        throw new RuntimeException();
    }
}