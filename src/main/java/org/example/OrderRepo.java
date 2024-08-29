package org.example;

public interface OrderRepo {
    void addOrder(Order order);

    void removeOrder(Order order);

    Order getOrder(int id);

    Order[] getAllOrders();
}
