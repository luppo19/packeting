package com.example.packeting.domain.order;

import com.example.packeting.boundary.order.OrderCommand;

public interface OrderMaker {

    OrderMade make(OrderCommand orderCommand);
}
