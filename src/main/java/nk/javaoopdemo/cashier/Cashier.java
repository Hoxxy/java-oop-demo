package nk.javaoopdemo.cashier;

import nk.javaoopdemo.cart.Cart;
import nk.javaoopdemo.product.Perishable;
import nk.javaoopdemo.product.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class Cashier {
    private Double subtotal = 0.0;
    private Double discount = 0.0;
    private Double total;

    public Cashier() {
        this.subtotal = 0.0;
        this.discount = 0.0;
    }

    public void printReceipt(Cart cart, LocalDateTime time) {
        System.out.println("Date: " + time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("---Products---");

        this.scanProducts(cart);

        System.out.println("-----------------------------------------------------------------------------------");

        this.calculateTotal();

        System.out.printf("SUBTOTAL: $%.2f%n", this.subtotal);
        System.out.printf("DISCOUNT: -$%.2f\r\n%n", this.discount);
        System.out.printf("TOTAL: $%.2f%n", this.total);
    }

    public void scanProducts(Cart cart) {
        for (Product product : cart.getProductList().keySet()) {
            Double quantity = cart.getProductList().get(product);
            Double unitPrice = product.getPrice();
            Double totalForProduct = quantity * unitPrice;

            product.printReceiptLine(quantity);

            this.addToSubtotal(totalForProduct);
            if (product.getDiscount() > 0.0) {
                this.addToDiscount(product.getDiscount());
            }

            System.out.println("\r\n");
        }
    }

    private void addToSubtotal(Double add) {
        this.subtotal += add;
    }
    private void addToDiscount(Double add) {
        this.discount += add;
    }
    private void calculateTotal() {
        this.total = this.subtotal - this.discount;
    }
}