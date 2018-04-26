package com.circle.base.mode.creator.prototype;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午10:18
 */
public class Square extends Shape{

    public Square(String id) {
        id = id;
        type = "Square";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Square::draw() method.");
    }


}
