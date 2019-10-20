package com.ww.rabbitmqtest.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {
    @Bean
    public DirectExchange exchange(){
        return (DirectExchange) ExchangeBuilder.directExchange("direct").durable(false).build();
    }

    @Bean
    public Queue queue(){
        return QueueBuilder.durable("log.info").build();
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(exchange()).with("log.info");
    }
}
