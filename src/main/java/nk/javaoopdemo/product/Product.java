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

    public abstract void printReceiptLine(Double quantity);
    public abstract void checkForDiscount(Double totalForProduct);
}