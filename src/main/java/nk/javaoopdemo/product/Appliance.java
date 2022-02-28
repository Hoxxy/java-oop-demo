package nk.javaoopdemo.product;

import java.time.LocalDate;

public class Appliance extends Product {
    private final String model;
    private final LocalDate productionDate;
    private final Double weight;

    public Appliance(String name, String brand, Double price, String model, LocalDate productionDate, Double weight) {
        super(name, brand, price);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
    }

    public String getModel() {
        return this.model;
    }

    public LocalDate getProductionDate() {
        return this.productionDate;
    }

    public Double getWeight() {
        return this.weight;
    }

    @Override
    public void printReceiptLine(Double quantity) {
        System.out.printf("%s %s %s%n", this.getName(), this.getBrand(), this.getModel());
        System.out.printf("%.0f x $%.2f = $%.2f%n", quantity, this.getPrice(), quantity*this.getPrice());
    }

    @Override
    public void checkForDiscount(Double totalForProduct) {}
}