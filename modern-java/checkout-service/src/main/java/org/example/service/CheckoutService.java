package org.example.service;

import org.example.domain.CheckOutStatus;
import org.example.domain.OrderDetails;
import org.example.domain.PaymentResponse;

public class CheckoutService {
    PaymentService paymentService;

    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public CheckOutStatus checkOutOrder(OrderDetails orderDetails) {
        var paymentResponse = paymentService.makePayment(orderDetails);
        if(paymentResponse.equals(PaymentResponse.SUCCESS)) {
            return CheckOutStatus.SUCCESS;
        }
        return CheckOutStatus.FAILURE;
    }
}
