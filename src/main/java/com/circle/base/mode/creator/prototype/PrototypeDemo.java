package com.circle.base.mode.creator.prototype;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午10:31
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        shape1.draw();
        Shape shape2 = ShapeCache.getShape("2");
        shape2.draw();
    }
}
