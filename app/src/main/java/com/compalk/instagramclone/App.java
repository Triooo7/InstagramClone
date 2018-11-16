package com.compalk.instagramclone;

import android.app.Application;

import com.parse.Parse;


public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("99FwfuEfgkdrpJ7ZLyxFBPMfZGO88CtjI2gKjeIn")
                // if defined
                .clientKey("pmfZM93XoEp5r4nru56XHgk6ZisHMroRSfaAZsKY")
                .server("https://parseapi.back4app.com/")
                .build());

    }
}
