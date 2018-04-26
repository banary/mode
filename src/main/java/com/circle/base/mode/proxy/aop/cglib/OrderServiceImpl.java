package com.circle.base.mode.proxy.aop.cglib;

import java.util.concurrent.TimeUnit;

public class OrderServiceImpl implements OrderService {

    @Override
    public void addOrder(String order) {
        System.out.println("模拟添加订单：" + order);
        try {
            TimeUnit.MILLISECONDS.sleep(20_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delOrder(String order) {
        System.out.println("模拟删除订单：" + order);
        try {
            TimeUnit.MILLISECONDS.sleep(40_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
