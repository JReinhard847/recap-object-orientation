package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {

    public List<Order> orderList;

    public OrderListRepo() {
        orderList = new ArrayList<>();
    }

    @Override
    public void addOrder(Order order) {
        orderList.add(order);
    }

    @Override
    public void removeOrder(Order order) {
        orderList.remove(order);
    }

    @Override
    public Order getOrder(int id) {
        for (Order order : orderList) {
            if (order.id() == id) {
                return order;
            }
        }
        return null;
    }

    @Override
    public Order[] getAllOrders() {
        return orderList.toArray(new Order[0]);
    }
}
