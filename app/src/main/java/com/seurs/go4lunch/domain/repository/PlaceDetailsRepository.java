package com.seurs.go4lunch.domain.repository;

import com.seurs.go4lunch.data.remote.places_api.dto.PlaceDetailsDto;
import com.seurs.go4lunch.util.Result;

public interface PlaceDetailsRepository {
    Result<PlaceDetailsDto> getPlaceDetailsResponse(String place_id);
}
