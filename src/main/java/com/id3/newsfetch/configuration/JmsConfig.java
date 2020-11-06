package com.id3.newsfetch.configuration;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@EnableJms //Bunu ben sonradan ekledim tetiklemek için
@Configuration
public class JmsConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("test-queue");
    }
}