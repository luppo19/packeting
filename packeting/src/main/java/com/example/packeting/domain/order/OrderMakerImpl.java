package com.example.packeting.domain.order;

import com.example.packeting.boundary.order.OrderCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class OrderMakerImpl implements OrderMaker {

    private final OrderRepository orderRepository;

    @Override
    public OrderMade make(OrderCommand orderCommand) {
        OrderAssebler orderAssebler = new OrderAssebler();
        OrderDisposition orderDisposition = orderAssebler.assemble(orderCommand, orderRepository);
        return orderDisposition.makeOrder();
    }
}
