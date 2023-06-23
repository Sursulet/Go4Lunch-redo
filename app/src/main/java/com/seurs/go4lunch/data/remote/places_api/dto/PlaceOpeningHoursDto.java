package com.seurs.go4lunch.data.remote.places_api.dto;

import java.util.List;

public class PlaceOpeningHoursDto {
    private boolean open_now;
    private List<PlaceOpeningHoursPeriodDto> periods;
    private List<PlaceSpecialDayDto> special_days;
    private String type;
    private List<String> weekday_text;
}
