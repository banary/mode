package com.circle.base.annotation;

import java.lang.reflect.Method;

public class TestMain {

    public static void main(String[] args) throws Exception {
        Method[] methods = TestMain.class.getDeclaredMethods();
        for (Method method:methods) {
            Test test = method.getAnnotation(Test.class);
            if(test != null){
                System.out.println(test.value());
            }
            method.invoke(new TestMain(), "3213");
        }
    }

    @Test("test1")
    public void test1(String str){
        System.out.println("这是一个测试方法");
    }

    public void test2(){
        System.out.println("这是一个测试方法");
    }

    @Test("test3")
    public void test3(){
        System.out.println("这是一个测试方法");
    }
}
