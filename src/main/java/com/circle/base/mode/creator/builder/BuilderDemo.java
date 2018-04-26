package com.circle.base.mode.creator.builder;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午5:23
 */
public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        vegMeal.showItems();

        System.out.println("----------------");

        Meal nonVegMeal = builder.prepareNonVegMeal();
        nonVegMeal.showItems();
    }
}
