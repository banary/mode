package com.circle.base.mode.creator.builder;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午5:16
 */
public interface Item {

    String name();

    Packing pack();

    BigDecimal price();
}
