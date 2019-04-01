package com.example.packeting.boundary.order;

import com.example.packeting.domain.order.OrderMade;

class OrderResponseMapper {

    static OrderResponse map(OrderMade orderMade) {
        return OrderResponse.builder()
                .amount(orderMade.getAmount())
                .clientId(orderMade.getClientId())
                .orderId(orderMade.getOrderId())
                .name(orderMade.getName())
                .quantity(orderMade.getQuantity())
                .build();
    }
}
