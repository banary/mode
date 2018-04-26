package com.circle.base.mode.construction.bridge;

/**
 * @Description
 * @Author eden
 * @Date 2018/4/4 下午5:41
 */
public class Circle extends Shape{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        this.drawAPI.drawCircle();
    }
}
