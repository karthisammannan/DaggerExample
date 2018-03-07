package com.example.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daggerexample.component.BattleComponent;
import com.example.daggerexample.component.DaggerBattleComponent;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cash cash = new Cash();
        Soliders soldiers = new Soliders();

        BattleComponent component = DaggerBattleComponent
                .builder().braavosModule(new BraavosModule(cash,soldiers)).build();
        War war = component.getWar();
        war.prepare();
        war.report();

        component.getCash().show();
        component.getSoliders().show();
    }
}
