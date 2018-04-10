package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description： 不会叫
 * @date : 2018/4/11
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        Log.e("MuteQuack", "不会叫");
    }
}
