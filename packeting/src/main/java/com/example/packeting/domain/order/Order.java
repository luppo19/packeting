package com.example.packeting.domain.order;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Builder
@Data
@Entity
public class Order {

    private int quantity;
    private String name;
    private BigDecimal amount;
    private String additionalData;
}
