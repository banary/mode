package com.circle.base.mode.creator.abstractFactory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午11:35
 */
public class FactoryProducer {

    public static final String COLOR = "COLOR";
    public static final String SHAPE = "SHAPE";

    public static AbstractFactory getFactory(String factoryType){
        switch (factoryType) {
            case COLOR : return new ColorFactory();
            case SHAPE : return new ShapeFactory();
            default : return new DefautFactory();
        }
    }
}
