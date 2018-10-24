package com.ashleysanders.cleaneating;

import android.app.Application;

public class Intro extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Globals.init(this);
    }
}

