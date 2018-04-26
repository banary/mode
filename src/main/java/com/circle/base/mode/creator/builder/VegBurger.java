package com.circle.base.mode.creator.builder;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午6:06
 */
public class VegBurger extends Burger{

    @Override
    public BigDecimal price() {
        return BigDecimal.TEN;
    }

    @Override
    public String name() {
        return "VegBurger";
    }
}
