package com.example.packeting.domain.order;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class OrderMade {

    private long orderId;
    private long clientId;
    private int quantity;
    private String name;
    private BigDecimal amount;
}
