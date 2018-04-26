package com.circle.base.mode.proxy.aop.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public <T> T getProxy(Class<T> clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (T)enhancer.create();
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
        //通过反射方法调用业务类的目标方法
        Object object = methodProxy.invokeSuper(target, args);
        PerformanceMonitor.end();
        return object;
    }

}
