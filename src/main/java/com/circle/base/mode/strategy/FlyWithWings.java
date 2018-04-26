package com.circle.base.mode.strategy;

/**
 * @Description 借助风飞行的具体实现
 * @Author totoro
 *
 */
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can fly with wings.");
	}

}
