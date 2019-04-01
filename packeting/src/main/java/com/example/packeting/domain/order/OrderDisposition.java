package com.example.packeting.domain.order;

import lombok.Builder;

@Builder
class OrderDisposition {

    private final Order order;
    private final OrderRepository orderRepository;

    OrderMade makeOrder(){
        return orderRepository.save(order);
    }
}
