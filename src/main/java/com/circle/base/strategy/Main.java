package com.circle.base.strategy;

/**
 * @Description 策略模式测试
 * @Author totoro
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Duck redDuck = new RedDuck(new FlyWithWings(), new Quack());
		Duck blueDuck = new BlueDuck();
		blueDuck.setFlyBehavior(new FlyNoway());
		blueDuck.setQuackBehavior(new QuackNoway());
		System.out.println("RedDuck---------->");
		redDuck.performFly();
		redDuck.performQuack();
		System.out.println("BuleDuck---------->");
		blueDuck.performFly();
		blueDuck.performQuack();
		System.out.println("BuleDuck---------->");
		blueDuck.setFlyBehavior(new FlyWithWings());
		blueDuck.setQuackBehavior(new Squeak());
		blueDuck.performFly();
		blueDuck.performQuack();
	}
}
