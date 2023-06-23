package com.seurs.go4lunch.di;

public class AppContainer {
    private static ViewModelFactory sFactory = null;

    public static ViewModelFactory getInstance() {
        if (sFactory == null) {
            synchronized (ViewModelFactory.class) {
                sFactory = new ViewModelFactory();
            }
        }
        return sFactory;
    }
}
