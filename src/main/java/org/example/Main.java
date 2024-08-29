package org.example;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(1, 9.99, "Hammer"));
        productRepo.addProduct(new Product(2, 14.99, "Schraubenzieher"));
        productRepo.addProduct(new Product(3, 9.99, "Helm"));


        ShopService shopService = new ShopService(new OrderMapRepo(),productRepo);
        shopService.placeOrder("Hammer","Franz");
    }
}