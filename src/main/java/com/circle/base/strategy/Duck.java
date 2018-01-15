package com.circle.base.strategy;

/**
 * @Description 鸭子
 * @Author totoro
 *
 */
public class Duck {
	
	public Duck() {
		super();
	}

	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super();
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	private String colour;
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
    public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	/**
	 * @return 颜色
	 */
	public String display(){
		return "";
	}
	
    /**
     * 飞
     */
    public void performFly(){
    	flyBehavior.fly();
    }
    
    public void performQuack(){
    	quackBehavior.quack();
    }
}
