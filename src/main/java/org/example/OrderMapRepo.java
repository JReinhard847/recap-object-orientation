package org.example;

import java.util.HashMap;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {
    private final Map<Integer, Order> orders;

    public OrderMapRepo() {
        orders = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        orders.put(order.id(), order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order.id());
    }

    @Override
    public Order getOrder(int id) {
        return orders.get(id);
    }

    @Override
    public Order[] getAllOrders() {
        return orders.values().toArray(new Order[0]);
    }
}
