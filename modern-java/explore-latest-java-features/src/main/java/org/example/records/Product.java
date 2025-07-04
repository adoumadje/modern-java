package org.example.records;

import java.math.BigDecimal;

public record Product(String name, BigDecimal price, String type) {
    public Product {
        if(name == null || name.isBlank()) {
            throw new  IllegalArgumentException("name can't be empty");
        }

        if(price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("price must be a positive number");
        }
    }

    public Product(String name, BigDecimal price) {
        this(name, price, "GENERAL");
    }
}
