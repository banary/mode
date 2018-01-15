package com.circle.base.singleton;

/**
 * 单例模式：枚举类实现（线程安全的）
 */
public enum EnumSingleton {

    INSTANCE {
        @Override
        public void print(){
            System.out.println("This is a enum Singleton");
        }
    };

    public abstract void print();
}
