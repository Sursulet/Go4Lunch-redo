package com.seurs.go4lunch.data.remote.places_api;

import com.seurs.go4lunch.data.remote.places_api.dto.NearbySearchDto;
import com.seurs.go4lunch.data.remote.places_api.dto.PlaceDetailsDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlacesApi {

    @GET("/maps/api/place/nearbysearch/json?radius=500&type=restaurant")
    Call<NearbySearchDto> getNearbySearchResponse(
            @Query("location") String location,
            @Query("key") String key
    );

    @GET("/maps/api/place/details/json?parameters")
    Call<PlaceDetailsDto> getPlaceDetailsResponse(
            @Query("place_id") String place_id,
            @Query("key") String key
    );
}
