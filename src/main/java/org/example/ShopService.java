package org.example;

import java.util.Random;

public class ShopService {
    private final OrderRepo orderRepo;
    private final ProductRepo productRepo;
    private static final Random idGenerator = new Random();

    public ShopService(OrderRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    public void placeOrder(Order order) {
        if (productRepo.hasProduct(order.product())) {
            orderRepo.addOrder(order);
            System.out.println("Order placed");
        } else {
            System.out.println("The ordered product " + order.product() + " is currently out of stock.");
        }
    }

    public void placeOrder(Product product, String customerName) {
        Order order = new Order(product, idGenerator.nextInt(), customerName);
        placeOrder(order);
    }

    public void placeOrder(int productId, String customerName) {
        if (productRepo.getProductById(productId) != null) {
            Order order = new Order(productRepo.getProductById(productId), idGenerator.nextInt(), customerName);
            placeOrder(order);
        } else {
            System.out.println("There is no product with product id " + productId);
        }
    }

    public void placeOrder(String productName, String customerName) {
        if (productRepo.getProductByName(productName) != null) {
            Order order = new Order(productRepo.getProductByName(productName), idGenerator.nextInt(), customerName);
            placeOrder(order);
        } else {
            System.out.println("There is no product named " + productName);
        }
    }
}
