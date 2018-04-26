package com.circle.base.mode.strategy;

/**
 * @Description 蓝色鸭子
 * @Author totoro
 *
 */
public class BlueDuck extends Duck{

	public BlueDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	public BlueDuck() {
		super();
	}

	@Override
	public String display() {
		return "blue";
	}
	
}
