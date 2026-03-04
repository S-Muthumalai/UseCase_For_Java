package com.example.ecom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ecommerce {

    public List<Product> addProduct() {
        List<Product> p = new ArrayList<>();
        p.add(new Product(1, "iPhone", 200000));
        p.add(new Product(2, "iPad", 99990));
        p.add(new Product(3, "MacBook", 158780));
        p.add(new Product(4, "ASUS TUF A15 Laptop", 80000));
        p.add(new Product(5, "Infinix Phone", 10999));
        return p;
    }

    public void showProduct(List<Product> p) {
        Iterator<Product> it = p.iterator();
        while (it.hasNext()) {
            Product p1 = it.next();
            System.out.println(p1.toString());
        }
    }

    public static void main(String[] args) {
        Ecommerce e = new Ecommerce();
        List<Product> products = e.addProduct();

        System.out.println("=== Product Catalog ===");
        e.showProduct(products);

        CartController cart = new CartController();
        cart.addToCart(products.get(0), 1); // iPhone x1
        cart.addToCart(products.get(2), 2); // MacBook x2
        cart.addToCart(products.get(4), 3); // Infinix Phone x3
        cart.addToCart(products.get(2), 1); // MacBook +1 (now x3)
        cart.removeFromCart(products.get(0)); // remove iPhone

        // Display cart and total
        cart.displayCart();

        // Get total if you want to use it programmatically
        double total = cart.calculateTotal();
        System.out.printf("Programmatic Total: ₹%.2f%n", total);
    }
}