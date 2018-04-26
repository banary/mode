package com.circle.base.mode.creator.builder;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午6:08
 */
public class Coke extends ColdDrink{

    @Override
    public BigDecimal price() {
        return new BigDecimal("8");
    }

    @Override
    public String name() {
        return "Coke";
    }
}
