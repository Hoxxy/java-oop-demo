package nk.javaoopdemo.product;

public abstract class Product {
    private final String name;
    private final String brand;
    private final Double price;
    private Double discount;

    public Product(String name, String brand, Double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public Double getPrice() {
        return this.price;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void applyDiscount(Double quantity, Double discountCoeff) {
        if (discountCoeff < 1.0) {
            this.setDiscount(quantity * this.getPrice() * discountCoeff);
            System.out.printf("DISCOUNT %.0f%%  -$%.2f%n", discountCoeff * 100.0, this.getDiscount());
        }
    }

    public abstract void printReceiptLine(Double quantity);
    public abstract void checkForDiscount(Double totalForProduct);
}