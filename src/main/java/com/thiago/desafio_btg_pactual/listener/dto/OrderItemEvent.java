package com.thiago.desafio_btg_pactual.listener.dto;

import java.math.BigDecimal;

public record OrderItemEvent(
    String produto,
    Integer quantidade,
    BigDecimal preco
){}
