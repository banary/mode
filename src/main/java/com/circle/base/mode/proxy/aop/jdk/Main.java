package com.circle.base.mode.proxy.aop.jdk;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = (OrderService)Proxy.newProxyInstance(OrderService.class.getClassLoader(), new Class[]{OrderService.class}, new PerformanceHandler(new OrderServiceImpl()));
        orderService.addOrder("订单001");
        orderService.delOrder("订单001-1");
    }
}
