package com.gzn.pattern.strategy;

import android.util.Log;

/**
 * @author： guozhennan
 * @version：
 * @Package：
 * @Description： 吱吱叫的行为
 * @date : 2018/4/11
 */

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        Log.e("Squeak", "吱吱叫");
    }
}
