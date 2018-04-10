package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description： 绿头鸭子，这里只定义了具体的外观，像行为就定义在父类中，设置行为的方法也定义在父类中
 * @date : 2018/4/11
 */

public class MallardDuck extends Duck {
    @Override
    protected void display() {
        Log.e("MallardDuck", "绿头鸭子");
    }
}
