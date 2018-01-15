package com.circle.base.template;

/**
 * 抽象模板
 * 本例中以制奶茶为例：红豆珍珠抹茶和香芋奶茶
 * Created by xiyongchun on 2016/9/20.
 */
public abstract class AbstractTea {

    /**
     * 制作奶茶的模板方法
     */
    public void  makeTea(){
        preCup();
        addSeasoning();
        addPearl();
        addWater();
        pack();
    }

    /**
     * 准备杯子
     */
    public void preCup(){
        System.out.println("准备杯子");
    }

    /**
     * 添加调料
     */
    public abstract void addSeasoning();


    /**
     * 添加蒸煮钩子方法（因为有的用户需要添加珍珠）
     */
    public void addPearl(){
        System.out.println("Do none.");
    }

    /**
     *
     */
    public void addWater(){
        System.out.println("添加绿茶");
    }

    public void pack(){
        System.out.println("打包奶茶");
    }
}
