package com.circle.base.mode.creator.abstractFactory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午10:52
 */
public interface Shape {

    void draw();
}

class DefaultShape implements Shape{
    @Override
    public void draw() {
        throw new UnsupportedOperationException();
    }
}
