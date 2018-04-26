package com.circle.base.mode.creator.prototype;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午10:21
 */
public class Circle extends Shape{

    public Circle(String id) {
        this.id = id;
        this.type = "Circle";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
