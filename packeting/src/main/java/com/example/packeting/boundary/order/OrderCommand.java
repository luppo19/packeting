package com.example.packeting.boundary.order;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class OrderCommand {

    private int quantity;
    private String name;
    private BigDecimal amount;
}
