package com.seurs.go4lunch.data.repository;

import com.seurs.go4lunch.data.remote.places_api.PlacesApi;
import com.seurs.go4lunch.data.remote.places_api.dto.NearbySearchDto;
import com.seurs.go4lunch.domain.repository.NearbySearchRepository;
import com.seurs.go4lunch.util.Result;

public class NearbySearchRepositoryImpl implements NearbySearchRepository {
    private PlacesApi api;

    public NearbySearchRepositoryImpl(PlacesApi api) {
        this.api = api;
    }

    @Override
    public Result<NearbySearchDto> getNearbySearch(String location) {
        return null;
    }
}
