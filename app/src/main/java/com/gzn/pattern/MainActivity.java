package com.gzn.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gzn.pattern.strategy.FlyWithWings;
import com.gzn.pattern.strategy.MallardDuck;
import com.gzn.pattern.strategy.Quack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strategy();
    }

    /**
     * 策略模式
     */
    private void strategy(){
        //创建一个绿头鸭子
        MallardDuck mallardDuck=new MallardDuck();
        //为绿头鸭子设置飞行和呱呱叫的行为，这里就是用的策略模式
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.fly();
        mallardDuck.quack();
    }
}
