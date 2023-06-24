package com.seurs.go4lunch;

import android.app.Application;

import com.seurs.go4lunch.di.AppContainer;

public class Go4LunchApplication extends Application {
    private static Application sApplication;
    private static AppContainer sAppContainer;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        sAppContainer = new AppContainer();
    }

    public static Application getApplication() {
        return sApplication;
    }

    public static AppContainer getAppContainer() {
        return sAppContainer;
    }
}
