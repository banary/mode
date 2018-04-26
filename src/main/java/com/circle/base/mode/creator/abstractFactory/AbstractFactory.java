package com.circle.base.mode.creator.abstractFactory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午11:28
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shapeType);

    abstract Color getColor(String colorType);
}

class DefautFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        throw new UnsupportedOperationException();
    }

    @Override
    Color getColor(String colorType) {
        throw new UnsupportedOperationException();
    }
}