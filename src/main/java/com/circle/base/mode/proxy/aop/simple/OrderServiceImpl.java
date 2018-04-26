package com.circle.base.mode.proxy.aop.simple;

import java.util.concurrent.TimeUnit;

public class OrderServiceImpl implements OrderService {

    @Override
    public void addOrder(String order) {
        PerformanceMonitor.begin("com.circle.base.mode.proxy.aop.simple.OrderServiceImpl.addOrder");
        System.out.println("模拟添加订单：" + order);
        try {
            TimeUnit.MILLISECONDS.sleep(20_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceMonitor.end();
    }

    @Override
    public void delOrder(String order) {
        PerformanceMonitor.begin("com.circle.base.mode.proxy.aop.simple.OrderServiceImpl.delOrder");
        System.out.println("模拟删除订单：" + order);
        try {
            TimeUnit.MILLISECONDS.sleep(40_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceMonitor.end();
    }
}
