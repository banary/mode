package com.circle.base.mode.proxy.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {

    /**
     * 目标的业务类，被代理对象
     */
    private Object target;

    public PerformanceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
        //通过反射方法调用业务类的目标方法
        Object object = method.invoke(target, args);
        PerformanceMonitor.end();
        return object;
    }
}
