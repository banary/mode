package com.circle.base.mode.proxy.aop.cglib;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = new CglibProxy().getProxy(OrderServiceImpl.class);
        orderService.addOrder("订单001");
        orderService.delOrder("订单001-1");
    }
}
