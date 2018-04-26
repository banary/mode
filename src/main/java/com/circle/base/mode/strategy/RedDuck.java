package com.circle.base.mode.strategy;

/**
 * @Description 红鸭
 * @Author totoro
 *
 */
public class RedDuck extends Duck{

	public RedDuck() {
		super();
	}

	public RedDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	@Override
	public String display() {
		return "red";
	}
	
}
