package com.example.packeting.domain.order;

import com.example.packeting.boundary.order.OrderCommand;

class OrderAssebler {

    OrderDisposition assemble(OrderCommand orderCommand, OrderRepository orderRepository) {
        return OrderDisposition.builder()
                .order(prepareOrder(orderCommand))
                .orderRepository(orderRepository)
                .build();
    }

    Order prepareOrder(OrderCommand orderCommand) {
        //validation orelse throw
        return Order.builder()
                .amount(orderCommand.getAmount())
                .name(orderCommand.getName())
                .quantity(orderCommand.getQuantity())
                .additionalData("Retrieve and set client")
                .build();
    }
}
