package com.circle.base.mode.creator.abstractFactory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午10:53
 */
public interface Color {

    void fill();
}

class DefaultColor implements Color{
    @Override
    public void fill() {
        throw new UnsupportedOperationException();
    }
}
