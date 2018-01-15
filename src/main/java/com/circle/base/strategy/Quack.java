package com.circle.base.strategy;

/**
 * @Description 呱呱叫的具体实现
 * @Author totoro
 *
 */
public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("I can gua gua.");
	}

}
