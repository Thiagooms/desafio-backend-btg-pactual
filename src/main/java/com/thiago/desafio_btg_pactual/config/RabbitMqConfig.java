package com.thiago.desafio_btg_pactual.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREATE_QUEUE = "btg-pactual-order-created";
}
