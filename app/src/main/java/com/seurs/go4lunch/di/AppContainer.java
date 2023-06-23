package com.seurs.go4lunch.di;

import static com.seurs.go4lunch.util.Constants.BASE_URL;

import com.seurs.go4lunch.data.remote.places_api.PlacesApi;

import retrofit2.Retrofit;

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

    public PlacesApi placesApi = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
            .create(PlacesApi.class);
}
