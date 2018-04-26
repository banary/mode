package com.circle.base.mode.creator.abstractFactory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午11:22
 */
public class ColorFactory extends AbstractFactory{

    public static final String BLUE = "BLUE";
    public static final String BLACK = "BLACK";

    @Override
    public Color getColor(String colorType){
        switch (colorType){
            case BLUE : return new Blue();
            case BLACK : return new Black();
            default : return new DefaultColor();
        }
    }

    @Override
    Shape getShape(String shapeType) {
        throw new UnsupportedOperationException();
    }
}
