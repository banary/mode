package com.circle.base.mode.strategy;

/**
 * @Description 不能飞的具体实现
 * @Author totoro
 *
 */
public class FlyNoway implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can not fly.");
	}

}
