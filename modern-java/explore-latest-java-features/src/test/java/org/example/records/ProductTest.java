package org.example.records;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void createProduct() {
        String expectedName = "galaxy S3";
        BigDecimal expectedPrice = BigDecimal.valueOf(150.19);
        String expectedType = "PHONE";
        Product product = new Product(expectedName, expectedPrice, expectedType);

        System.out.println("product is: " + product);
        assertEquals(expectedName, product.name());
        assertEquals(expectedPrice, product.price());
        assertEquals(expectedType, product.type());
    }

    @Test
    void createProduct_InvalidName() {
        String theName = "";
        BigDecimal thePrice = BigDecimal.valueOf(150.19);
        String theType = "PHONE";

        var exception =  assertThrows(IllegalArgumentException.class,
                () -> new Product(theName, thePrice, theType));

        assertEquals("name can't be empty", exception.getMessage());
    }

    @Test
    void createProduct_InvalidPrice() {
        String theName = "galaxy S3";
        BigDecimal thePrice = BigDecimal.valueOf(-150.19);
        String theType = "PHONE";

        var exception =  assertThrows(IllegalArgumentException.class,
                () -> new Product(theName, thePrice, theType));

        assertEquals("price must be a positive number", exception.getMessage());
    }

    @Test
    void createProduct_WithoutType() {
        String theName = "galaxy S3";
        BigDecimal thePrice = BigDecimal.valueOf(150.19);

        Product product = new Product(theName, thePrice);

        assertEquals("GENERAL", product.type());
    }

    @Test
    void createProduct_CheckEquals() {
        // Given
        String theName = "galaxy S3";
        BigDecimal thePrice = BigDecimal.valueOf(150.19);
        String theType = "PHONE";

        Product product1 = new Product(theName, thePrice, theType);
        Product product2 = new Product(theName, thePrice, theType);

        // When
        // Then
        assertEquals(product1, product2);
    }
}