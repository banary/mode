package com.circle.base.mode.creator.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午5:20
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public BigDecimal getCost(){

        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Item item:items){
            totalPrice = totalPrice.add(item.price());
        }
        return totalPrice;
    }

    public void showItems(){
        for(Item item:items){
            System.out.println(item.name() + ":" + item.pack().pack() + ":" + item.price());
        }
    }
}
