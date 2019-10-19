package com.ww.rabbitmqtest;

import com.ww.rabbitmqtest.message.LogInfoMsg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class RabbitmqTestApplicationTests {

    @Autowired
    Sender sender;

    @Test
    void contextLoads() throws InterruptedException {
        Long id=1L;
        while (true){
            Thread.sleep(1000);
            sender.send(new LogInfoMsg(id,"testmq","rabbitmq"));
            id++;
        }
    }

}
