package com.example.ecom;

import java.util.HashMap;
import java.util.Map;

public class CartController {
    // Map stores: Key = Product, Value = Quantity
    private final Map<Product, Integer> cartItems;

    public CartController() {
        this.cartItems = new HashMap<>();
    }

    // 1. Add or Update Product in Cart
    public void addToCart(Product product, int qty) {
        if (qty <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }
        cartItems.merge(product, qty, Integer::sum);
        System.out.println("Added/Updated " + product.getName() + " (+" + qty + ")");
    }

    // 2. Remove Product entirely
    public void removeFromCart(Product product) {
        if (cartItems.remove(product) != null) {
            System.out.println(product.getName() + " removed from cart.");
        } else {
            System.out.println(product.getName() + " was not in the cart.");
        }
    }

    // 3. Calculate Total Price
    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    // 4. Display Cart
    public void displayCart() {
        System.out.println("\n--- Your Shopping Cart ---");
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty!");
        } else {
            for (Map.Entry<Product, Integer> e : cartItems.entrySet()) {
                Product p = e.getKey();
                int q = e.getValue();
                double sub = p.getPrice() * q;
                System.out.printf("%s | Qty: %d | Subtotal: ₹%.2f%n", p.getName(), q, sub);
            }
            System.out.printf("TOTAL PAYABLE: ₹%.2f%n", calculateTotal());
        }
        System.out.println("--------------------------\n");
    }
}
