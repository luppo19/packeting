package com.example.packeting.boundary.order;

import com.example.packeting.domain.order.OrderMade;
import com.example.packeting.domain.order.OrderMaker;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderMaker orderMaker;

    @PostMapping(value = "/",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrderResponse> makeOrder(@Valid @RequestBody MakeOrder makeOrder) {
        OrderMade order = orderMaker.make(OrderMapper.map(makeOrder));
        return new ResponseEntity<>(OrderResponseMapper.map(order), HttpStatus.OK);
    }
}