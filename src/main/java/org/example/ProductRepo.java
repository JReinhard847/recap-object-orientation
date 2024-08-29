package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private final List<Product> products;

    public ProductRepo() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.id() == id) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.name() == name) {
                return product;
            }
        }
        return null;
    }

    public boolean hasProduct(Product product) {
        return products.contains(product);
    }

    public Product[] getAllProducts() {
        return products.toArray(new Product[0]);
    }
}
