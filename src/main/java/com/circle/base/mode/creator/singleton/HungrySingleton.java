package com.circle.base.mode.creator.singleton;

/**
 * 单例模式：饿汉模式（线程安全的）
 * 保证可行的最直接做法，类加载时实例化实例，即使用不到也会初始化
 * Created by Administrator on 2016/9/16.
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
