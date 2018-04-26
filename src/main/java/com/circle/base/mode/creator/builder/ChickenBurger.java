package com.circle.base.mode.creator.builder;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午6:07
 */
public class ChickenBurger extends Burger{

    @Override
    public BigDecimal price() {
        return new BigDecimal("11");
    }

    @Override
    public String name() {
        return "ChickenBurger";
    }
}
