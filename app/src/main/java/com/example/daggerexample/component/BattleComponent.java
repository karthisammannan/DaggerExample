package com.example.daggerexample.component;

import com.example.daggerexample.Boltons;
import com.example.daggerexample.BraavosModule;
import com.example.daggerexample.Cash;
import com.example.daggerexample.Soliders;
import com.example.daggerexample.Starks;
import com.example.daggerexample.War;

import dagger.Component;

/**
 * Created by Raghuvarma on 7/3/2018.
 */

@Component(modules = BraavosModule.class)
public interface BattleComponent {
    War getWar();
    Starks getStarks();
    Boltons getBoltons();
    Cash getCash();
    Soliders getSoliders();
}
