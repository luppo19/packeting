package com.example.packeting.infrastructure;

import com.example.packeting.domain.order.Order;
import com.example.packeting.domain.order.OrderMade;
import com.example.packeting.domain.order.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
class OrderRepositoryImpl implements OrderRepository {

    @Override
    public OrderMade save(Order order) {
        log.info("Ordering using JPA {}", order);
        return OrderMadeMapper.map(order);
    }
}
