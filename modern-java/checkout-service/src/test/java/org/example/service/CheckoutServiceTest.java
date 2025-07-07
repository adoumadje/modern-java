package org.example.service;

import org.example.domain.Card;
import org.example.domain.CardType;
import org.example.domain.CheckOutStatus;
import org.example.domain.OrderDetails;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {
    PaymentService paymentService = new PaymentService();
    CheckoutService checkoutService = new CheckoutService(paymentService);

    @ParameterizedTest
    @EnumSource(CardType.class)
    void checkOutOrderTest(CardType cardType) {
        var order = orderDetails(cardType);
        var response = checkoutService.checkOutOrder(order);

        assertEquals(CheckOutStatus.SUCCESS, response);
    }

    static OrderDetails orderDetails(CardType cardType) {
        var card = new Card("ABC", "459",
                "10/32",  cardType);
        return new OrderDetails("1234", card, 99.12);
    }
}