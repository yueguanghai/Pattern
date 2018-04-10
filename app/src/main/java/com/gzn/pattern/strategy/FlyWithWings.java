package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description： 飞行行为，会飞就设置这个类的实例
 * @date : 2018/4/11
 */

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        Log.e("FlyWithWings","用翅膀飞起来了");
    }
}
