package com.circle.base.mode.strategy;

/**
 * @Description 不会叫的具体实现
 * @Author totoro
 *
 */
public class QuackNoway implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I am a mute.");
	}

}
