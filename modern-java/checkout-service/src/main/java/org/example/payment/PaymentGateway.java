package org.example.payment;

import org.example.domain.Card;
import org.example.domain.PaymentResponse;

public sealed abstract class PaymentGateway permits CreditCardPayment, DebitCardPayment, RewardsCardPayment {
    public abstract PaymentResponse makePayment(Card card, double amount);
}
