package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description： 橡皮鸭子
 * @date : 2018/4/11
 */

public class RubberDuck extends Duck {
    @Override
    protected void display() {
        Log.e("RubberDuck", "橡皮鸭子");
    }


}
