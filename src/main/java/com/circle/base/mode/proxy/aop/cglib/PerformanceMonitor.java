package com.circle.base.mode.proxy.aop.cglib;

public class PerformanceMonitor {

    private static ThreadLocal<MethodPerformance> performanceThreadLocal = new ThreadLocal<>();

    public static void begin(String method){
        System.out.println("begin monitor...");
        performanceThreadLocal.set(new MethodPerformance(method));
    }

    public static void end(){
        System.out.println("end monitor...");
        performanceThreadLocal.get().printPerformance();
    }
}
