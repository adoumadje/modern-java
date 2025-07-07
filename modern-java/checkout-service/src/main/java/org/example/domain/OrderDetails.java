package org.example.domain;

public record OrderDetails(
        String orderId,
        Card card,
        double finalAmount
) {
}
