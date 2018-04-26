package com.circle.base.mode.proxy.aop.simple;

public class MethodPerformance {

    private String method;
    private long begin;
    private long end;

    public MethodPerformance(String method) {
        this.method = method;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance(){
        this.end = System.currentTimeMillis();
        System.out.println(method + "花费" + (end-begin) + "ms.");
    }
}
