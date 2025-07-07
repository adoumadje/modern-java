package org.example.service;

import org.example.domain.OrderDetails;
import org.example.domain.PaymentResponse;
import org.example.payment.PaymentFactory;

public class PaymentService {
    public PaymentResponse makePayment(OrderDetails orderDetails) {
        var paymentGateway = PaymentFactory.paymentGateway(orderDetails.card().cardType());
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.finalAmount());
    }
}
