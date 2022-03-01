package com.sgai.equalsExer.order;

import java.util.Objects;

/**
 * @author JaxZmy
 * @Description 测试equals方法重写
 * @date 2022年02月25日 1:57 PM
 */
public class Order {

    private int orderId;
    private String orderName;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public Order(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && orderName.equals(order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }
}
