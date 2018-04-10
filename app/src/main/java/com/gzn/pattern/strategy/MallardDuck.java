package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description：
 * @date : 2018/4/11
 */

public class MallardDuck extends Duck {
    @Override
    protected void display() {
        Log.e("MallardDuck", "绿头鸭子");
    }
}
