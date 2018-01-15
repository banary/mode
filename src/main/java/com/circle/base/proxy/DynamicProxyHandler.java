package com.circle.base.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * jdk动态代理
 */
public class DynamicProxyHandler implements InvocationHandler{

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        return method.invoke(proxied, args);
    }

    public static void main(String[] args) {
        TicketAgency ticketAgency = (TicketAgency)Proxy.newProxyInstance(TrainStation.class.getClassLoader(), new Class[]{TicketAgency.class}, new DynamicProxyHandler(new TrainStation()));
        ticketAgency.sold();
    }
}
