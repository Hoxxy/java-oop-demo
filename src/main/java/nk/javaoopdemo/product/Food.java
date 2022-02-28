package nk.javaoopdemo.product;

import java.time.LocalDate;

public class Food extends PerishableProduct {
    public Food(String name, String brand, Double price, LocalDate expirationDate) {
        super(name, brand, price, expirationDate);
    }
}