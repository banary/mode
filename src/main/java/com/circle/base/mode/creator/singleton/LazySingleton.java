package com.circle.base.mode.creator.singleton;

/**
 * 单例模式：懒汉模式（线程安全的）
 * 使用时才会初始化实例，且同一时刻只有一条线程可以访问，性能低
 * Created by Administrator on 2016/9/16.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
