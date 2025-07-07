package org.example.domain;

public record Card(
        String cardName,
        String verificationCode,
        String expiryDate,
        CardType cardType
) {
}
