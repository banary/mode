package com.circle.base.template;

public class App
{
    public static void main( String[] args ) {
        System.out.println("--------开始制作红豆珍珠抹茶----------");
        AbstractTea hongDouTea = new HongDouTea();
        hongDouTea.makeTea();
        System.out.println("--------开始制作香芋奶茶----------");
        AbstractTea xiangYuTea = new XiangYuTea();
        xiangYuTea.makeTea();

    }
}
