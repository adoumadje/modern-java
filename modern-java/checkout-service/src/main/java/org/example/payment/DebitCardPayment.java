package org.example.payment;

import org.example.domain.Card;
import org.example.domain.PaymentResponse;

public final class DebitCardPayment extends PaymentGateway {
    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Acquires Debit Card Payment for the amount: " + amount);
        return PaymentResponse.SUCCESS;
    }
}
