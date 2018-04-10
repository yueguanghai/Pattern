package com.gzn.pattern.strategy;


/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description：鸭子类，所有鸭子品种的父类
 * @date : 2018/4/11
 */

public abstract class Duck {
    /**
     * 飞行行为
     */
    public FlyBehavior mFlyBehavior;
    /**
     * 呱呱叫的行为
     */
    public QuackBehavior mQuackBehavior;
    /**
     * 鸭子的外观，不同的鸭子外观可能不一样
     */
    protected abstract void display();

    /**
     * 设置飞行行为
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    /**
     * 设置呱呱叫行为
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    /**
     * 呱呱叫
     */
    public void quack(){
        mQuackBehavior.quack();
    }

    /**
     * 飞行
     */
    public void fly(){
        mFlyBehavior.fly();
    }
}
