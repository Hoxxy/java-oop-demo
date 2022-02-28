package nk.javaoopdemo.cart;

import nk.javaoopdemo.product.Product;

import java.util.LinkedHashMap;

public class Cart {
    private final LinkedHashMap<Product, Double> productsInCart = new LinkedHashMap<Product, Double>();

    public void addToCart(Product product, Double quantity) {
        this.productsInCart.put(product, quantity);
    }

    public LinkedHashMap<Product, Double> getProductList() {
        return productsInCart;
    }
}