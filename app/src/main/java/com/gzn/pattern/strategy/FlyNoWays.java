package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description：
 * @date : 2018/4/11
 */

public class FlyNoWays implements FlyBehavior {
    @Override
    public void fly() {
        Log.e("FlyNoWays", "不能飞");
    }
}
