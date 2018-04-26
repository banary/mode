package com.circle.base.mode.proxy.aop.simple;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        orderService.addOrder("订单001");
        orderService.delOrder("订单001-1");
    }
}
