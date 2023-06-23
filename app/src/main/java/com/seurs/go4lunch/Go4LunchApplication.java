package com.seurs.go4lunch;

import android.app.Application;

public class Go4LunchApplication extends Application {
    private static Application sApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
    }

    public static Application getApplication() {
        return sApplication;
    }
}
