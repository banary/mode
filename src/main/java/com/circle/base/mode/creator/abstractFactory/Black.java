package com.circle.base.mode.creator.abstractFactory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午11:06
 */
public class Black implements Color{

    @Override
    public void fill() {
        System.out.println("Black");
    }
}
