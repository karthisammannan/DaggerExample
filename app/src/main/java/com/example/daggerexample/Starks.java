package com.example.daggerexample;

import javax.inject.Inject;

/**
 * Created by Raghuvarma on 7/3/2018.
 */
public class Starks implements House {

    @Inject //Dagger 2
    public Starks(){
    }

    @Override
    public void prepareForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}