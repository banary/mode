package com.circle.base.mode.creator.builder;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午6:03
 */
public abstract class Burger implements Item{

    @Override
    public Packing pack() {
        return new Wrapper();
    }

    @Override
    public abstract BigDecimal price();
}
