package com.seurs.go4lunch.data.remote.places_api.dto;

import java.util.List;

public class PlaceDto {
    List<AddressComponentDto> address_components;
    String adr_address;
    String business_status;
    boolean curbside_pickup;
    PlaceOpeningHoursDto current_opening_hours;
    boolean delivery;
    boolean dine_in;
    PlaceEditorialSummaryDto editorial_summary;
    String formatted_address;
    String formatted_phone_number;
    GeometryDto geometry;
    String icon;
    String icon_background_color;
    String icon_mask_base_uri;
    String international_phone_number;
    String name;
    PlaceOpeningHoursDto opening_hours;
    List<PlacePhotoDto> photos;
    String place_id;
    PlusCodeDto plus_code;
    int price_level;
    double rating;
    boolean reservable;
    List<PlaceReviewDto> reviews;
    List<PlaceOpeningHoursDto> secondary_opening_hours;
    boolean serves_beer;
    boolean serves_breakfast;
    boolean serves_brunch;
    boolean serves_dinner;
    boolean serves_lunch;
    boolean serves_vegetarian_food;
    boolean serves_wine;
    boolean takeout;
    List<String> types;
    String url;
    int user_ratings_total;
    double utc_offset;
    String vicinity;
    String website;
    boolean wheelchair_accessible_entrance;
}
