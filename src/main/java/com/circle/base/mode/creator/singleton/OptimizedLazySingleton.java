package com.circle.base.mode.creator.singleton;

/**
 * 单例模式：懒汉模式（线程安全的）
 * 使用时才会初始化实例，只有初始化时才会持排它锁
 * Created by Administrator on 2016/9/16.
 */
public class OptimizedLazySingleton {

    private volatile static OptimizedLazySingleton instance;

    private OptimizedLazySingleton(){}

    public static synchronized OptimizedLazySingleton getInstance(){
        if(instance == null){
            synchronized (OptimizedLazySingleton.class){
                if(instance == null){
                    instance = new OptimizedLazySingleton();
                }
            }
        }
        return instance;
    }
}
