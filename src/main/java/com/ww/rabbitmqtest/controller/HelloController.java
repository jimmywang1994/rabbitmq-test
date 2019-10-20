package com.ww.rabbitmqtest.controller;

import com.ww.rabbitmqtest.Sender;
import com.ww.rabbitmqtest.message.LogInfoMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Sender sender;
    @GetMapping("/hello")
    public void hello(){
        Long id=1L;
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sender.send(new LogInfoMsg(id,"testmq","rabbitmq"));
            id++;
        }
    }
}
