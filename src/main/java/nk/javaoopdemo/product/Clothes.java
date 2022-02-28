package nk.javaoopdemo.product;

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
    }

    @Override
    public void checkForDiscount(Double totalForProduct) {}
}