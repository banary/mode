package com.circle.base.mode.creator.singleton;

/**
 * 单例模式：内部类（线程安全的）
 * 1. 支持懒加载
 * 2. 线程安全，采用类加载时是用单线程加载
 */
public class InnerLazySingleton {

    private InnerLazySingleton() {
    }

    public static InnerLazySingleton getInstance(){
        return LazySingletonHolder.INSTANCE;
    }

    private static class LazySingletonHolder{
        private static final InnerLazySingleton INSTANCE = new InnerLazySingleton();
    }
}
