package nk.javaoopdemo;

import nk.javaoopdemo.cart.Cart;
import nk.javaoopdemo.cashier.Cashier;
import nk.javaoopdemo.product.Appliance;
import nk.javaoopdemo.product.Beverage;
import nk.javaoopdemo.product.Clothes;
import nk.javaoopdemo.product.Food;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Cashier cashier = new Cashier();

        populateCart(cart);

        cashier.printReceipt(cart, LocalDateTime.now());
    }

    public static void populateCart(Cart cart) {
        cart.addToCart(new Food("apples", "BrandA", 1.5, LocalDate.of(2022, 3, 3)), 2.45);
        cart.addToCart(new Beverage("milk", "BrandM", 0.99, LocalDate.of(2022, 3, 11)), 3.0);
        cart.addToCart(new Clothes("T-shirt", "BrandT", 15.99, "M", "violet"), 2.0);
        cart.addToCart(new Appliance("laptop", "BrandL", 2345.0, "ModelL", LocalDate.of(2021, 3, 3), 1.125), 1.0);
    }
}
