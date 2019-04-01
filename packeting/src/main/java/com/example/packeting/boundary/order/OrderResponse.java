package com.example.packeting.boundary.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
class OrderResponse {

    private long orderId;
    private long clientId;
    private int quantity;
    private String name;
    private BigDecimal amount;
}
