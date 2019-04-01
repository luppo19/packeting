package com.example.packeting.boundary.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class MakeOrder {

    private int quantity;
    private String name;
    private BigDecimal amount;
}
