package com.circle.base.mode.construction.bridge;

/**
 * @Description
 * @Author eden
 * @Date 2018/4/4 下午5:40
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
