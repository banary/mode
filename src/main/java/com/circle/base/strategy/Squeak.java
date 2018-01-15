package com.circle.base.strategy;

/**
 * @Description 吱吱叫的具体实现
 * @Author totoro
 *
 */
public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("I can zhi zhi.");
	}

	
}
