package org.example;

public record Order(Product product,
                    int id,
                    String customerName) {
}
