package com.circle.base.mode.creator.builder;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午6:04
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing pack() {
        return new Bottle();
    }

    @Override
    public abstract BigDecimal price();
}
