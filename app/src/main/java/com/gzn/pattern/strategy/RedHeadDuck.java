package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description：
 * @date : 2018/4/11
 */

public class RedHeadDuck extends Duck {
    @Override
    protected void display() {
        Log.e("RedHeadDuck", "红头鸭子");
    }
}
