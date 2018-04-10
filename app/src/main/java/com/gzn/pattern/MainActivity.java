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

        MallardDuck mallardDuck=new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.fly();
        mallardDuck.quack();
    }
}
