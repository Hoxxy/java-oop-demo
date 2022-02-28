package nk.javaoopdemo.product;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Perishable extends Product {
    private final LocalDate expirationDate;

    public Perishable(String name, String brand, Double price, LocalDate expirationDate) {
        super(name, brand, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    @Override
    public void printReceiptLine(Double quantity) {
        System.out.printf("%s %s%n", this.getName(), this.getBrand());
        if ((quantity % 1) == 0) {
            System.out.printf("%.0f x $%.2f = $%.2f%n", quantity, this.getPrice(), quantity*this.getPrice());
        }
        else {
            System.out.printf("%.2f x $%.2f = $%.2f%n", quantity, this.getPrice(), quantity*this.getPrice());
        }
        this.checkForDiscount(quantity);
    }

    @Override
    public void checkForDiscount(Double quantity) {
        Double discountCoeff = 1.0;
        long daysDiff = DAYS.between(LocalDate.now(), this.getExpirationDate());

        if (daysDiff > 0 && daysDiff <= 5) {
            discountCoeff = 0.3;
        }
        else if (daysDiff == 0) {
            discountCoeff = 0.7;
        }


        this.applyDiscount(quantity, discountCoeff);
    }
}