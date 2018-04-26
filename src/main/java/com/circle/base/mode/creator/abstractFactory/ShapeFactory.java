package com.circle.base.mode.creator.abstractFactory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午10:54
 */
public class ShapeFactory extends AbstractFactory{

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";

    @Override
    public Shape getShape(String shapeType){
        switch (shapeType){
            case CIRCLE : return new Circle();
            case SQUARE : return new Square();
            default : return new DefaultShape();
        }
    }

    @Override
    Color getColor(String colorType) {
        throw new UnsupportedOperationException();
    }
}
