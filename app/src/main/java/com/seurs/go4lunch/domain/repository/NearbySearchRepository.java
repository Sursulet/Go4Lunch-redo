package com.seurs.go4lunch.domain.repository;

import com.seurs.go4lunch.util.Result;
import com.seurs.go4lunch.data.remote.places_api.dto.NearbySearchDto;

public interface NearbySearchRepository {
    Result<NearbySearchDto> getNearbySearch(
            String location
    );
}
