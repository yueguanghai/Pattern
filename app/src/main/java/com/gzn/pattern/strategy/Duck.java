package com.gzn.pattern.strategy;


/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description：
 * @date : 2018/4/11
 */

public abstract class Duck {
    public FlyBehavior mFlyBehavior;

    public QuackBehavior mQuackBehavior;
    /**
     * 鸭子的外观
     */
    protected abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }
    public void quack(){
        mQuackBehavior.quack();
    }

    public void fly(){
        mFlyBehavior.fly();
    }
}
