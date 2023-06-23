package com.seurs.go4lunch.data.repository;

import com.seurs.go4lunch.data.remote.places_api.PlacesApi;
import com.seurs.go4lunch.data.remote.places_api.dto.PlaceDetailsDto;
import com.seurs.go4lunch.domain.repository.PlaceDetailsRepository;
import com.seurs.go4lunch.util.Result;

public class PlaceDetailsRepositoryImpl implements PlaceDetailsRepository {

    private PlacesApi api;

    public PlaceDetailsRepositoryImpl(PlacesApi api) {
        this.api = api;
    }

    @Override
    public Result<PlaceDetailsDto> getPlaceDetailsResponse(String place_id) {
        return null;
    }
}
