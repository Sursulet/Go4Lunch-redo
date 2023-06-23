package com.seurs.go4lunch.data.remote.places_api.dto;

import java.util.List;

public class NearbySearchDto {
    List<String> html_attributions;
    List<PlaceDto> results;
    PlacesSearchStatusDto status;
    String error_message;
    List<String> info_messages;
    String next_page_token;

    public List<PlaceDto> getResults() {
        return results;
    }
}
