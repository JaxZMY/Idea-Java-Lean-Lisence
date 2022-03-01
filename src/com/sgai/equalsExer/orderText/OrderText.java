package com.sgai.equalsExer.orderText;

import com.sgai.equalsExer.order.Order;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月25日 2:03 PM
 */
public class OrderText {
    public static void main(String[] args) {
        Order o1 = new Order(111, "张三");
        Order o2 = new Order(111, "张三");
        System.out.println(o1.equals(o2));
    }
}
