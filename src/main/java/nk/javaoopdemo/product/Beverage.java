package nk.javaoopdemo.product;

import java.time.LocalDate;

public class Beverage extends PerishableProduct {
    public Beverage(String name, String brand, Double price, LocalDate expirationDate) {
        super(name, brand, price, expirationDate);
    }

}