package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description：不能飞的行为，如果鸭子不能飞，那么就可以为其飞行行为设置这个实例
 * @date : 2018/4/11
 */

public class FlyNoWays implements FlyBehavior {
    @Override
    public void fly() {
        Log.e("FlyNoWays", "不能飞");
    }
}
