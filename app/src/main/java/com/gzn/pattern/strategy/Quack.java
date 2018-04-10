package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description： 呱呱叫的行为
 * @date : 2018/4/11
 */

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        Log.e("Quack", "呱呱叫");
    }
}
