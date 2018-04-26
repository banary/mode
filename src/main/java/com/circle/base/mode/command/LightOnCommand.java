package com.circle.base.mode.command;

/**
 * Created by Administrator on 2016/9/18.
 */
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        this.light.on();
    }

    /**
     * 撤销操作
     */
    public void repeal(){
        this.light.off();
    }
}
