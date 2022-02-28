package nk.javaoopdemo.product;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Clothes extends Product {
    private final String size;
    private final String color;

    public Clothes(String name, String brand, Double price, String size, String color) {
        super(name, brand, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void printReceiptLine(Double quantity) {
        System.out.printf("%s %s %s %s%n", this.getName(), this.getBrand(), this.getSize(), this.getColor());
        System.out.printf("%.0f x $%.2f = $%.2f%n", quantity, this.getPrice(), quantity*this.getPrice());
        this.checkForDiscount(quantity);
    }

    @Override
    public void checkForDiscount(Double quantity) {
        Double discountCoeff = 1.0;
        int day = LocalDate.now().getDayOfWeek().getValue();

        if (day >= 2 && day <= 6) {
            discountCoeff = 0.1;
        }
        this.applyDiscount(quantity, discountCoeff);
    }
}