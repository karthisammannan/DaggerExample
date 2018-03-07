package com.example.daggerexample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Raghuvarma on 7/3/2018.
 */
@Module
public class BraavosModule {
    Cash cash;
    Soliders soliders;

    @Provides
    public Cash getCash() {
        return cash;
    }

    @Provides
    public Soliders getSoliders() {
        return soliders;
    }


    public BraavosModule(Cash cash, Soliders soliders) {
        this.cash = cash;
        this.soliders = soliders;
    }

}
