package com.seurs.go4lunch.di;

import static com.seurs.go4lunch.util.Constants.BASE_URL;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.seurs.go4lunch.Go4LunchApplication;
import com.seurs.go4lunch.data.location.DefaultLocationTracker;
import com.seurs.go4lunch.data.remote.places_api.PlacesApi;
import com.seurs.go4lunch.data.repository.NearbySearchRepositoryImpl;
import com.seurs.go4lunch.data.repository.PlaceDetailsRepositoryImpl;
import com.seurs.go4lunch.domain.location.LocationTracker;
import com.seurs.go4lunch.domain.repository.NearbySearchRepository;
import com.seurs.go4lunch.domain.repository.PlaceDetailsRepository;

import retrofit2.Retrofit;

public class AppContainer {

    public static PlacesApi placesApi = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
            .create(PlacesApi.class);

    private FusedLocationProviderClient client = LocationServices.getFusedLocationProviderClient(Go4LunchApplication.getApplication());
    private LocationTracker tracker = new DefaultLocationTracker(Go4LunchApplication.getApplication(), client);

    private NearbySearchRepository nearbySearchRepository = new NearbySearchRepositoryImpl(placesApi);
    public PlaceDetailsRepository placeDetailsRepository = new PlaceDetailsRepositoryImpl(placesApi);
}
