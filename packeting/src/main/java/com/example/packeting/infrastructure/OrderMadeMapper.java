package com.example.packeting.infrastructure;

import com.example.packeting.domain.order.Order;
import com.example.packeting.domain.order.OrderMade;

import java.util.Random;

class OrderMadeMapper {

    static OrderMade map(Order order) {
        return OrderMade.builder()
                .amount(order.getAmount())
                .clientId(new Random().nextLong())
                .orderId(new Random().nextLong())
                .name(order.getName())
                .quantity(order.getQuantity())
                .build();
    }
}
