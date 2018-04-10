package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description：
 * @date : 2018/4/11
 */

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        Log.e("FlyWithWings","用翅膀飞起来了");
    }
}
