package com.circle.base.mode.creator.abstractFactory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午11:45
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.COLOR);
        Color color = colorFactory.getColor(ColorFactory.BLACK);
        color.fill();

        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.SHAPE);
        Shape shape = shapeFactory.getShape(ShapeFactory.CIRCLE);
        shape.draw();
    }
}
