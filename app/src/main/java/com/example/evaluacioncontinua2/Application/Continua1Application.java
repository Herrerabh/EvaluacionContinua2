package com.example.evaluacioncontinua2.Application;

import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatDelegate;

public class Continua1Application extends Application {

    private static Continua1Application instance;
    private static Context appContext;

    public static Continua1Application getInstance(){return instance;}
    public static Context getAppContext(){return appContext;}
    public void setAppContext(Context mAppContext){this.appContext=mAppContext;}

    @Override
    public void onCreate(){
        super.onCreate();
        instance=this;

        this.setAppContext(getApplicationContext());
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
