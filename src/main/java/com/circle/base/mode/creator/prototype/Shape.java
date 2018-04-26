package com.circle.base.mode.creator.prototype;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/4 上午10:12
 */
public abstract class Shape implements Cloneable{

    protected String id;
    protected String type;

    protected abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

}
