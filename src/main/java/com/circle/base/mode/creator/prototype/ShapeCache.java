package com.circle.base.mode.creator.prototype;

import java.util.HashMap;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午10:24
 */
public class ShapeCache {

    private static final HashMap<String, Shape> cache = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape shape = cache.get(shapeId);
        return (Shape)shape.clone();
    }

    public static void loadCache(){
        cache.put("1", new Circle("1"));
        cache.put("2", new Square("2"));
    }
}
