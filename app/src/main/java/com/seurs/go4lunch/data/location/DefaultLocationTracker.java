package com.seurs.go4lunch.data.location;

import android.Manifest;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;

import androidx.core.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.seurs.go4lunch.domain.location.LocationTracker;

public class DefaultLocationTracker implements LocationTracker {
    private Application application;
    private FusedLocationProviderClient client;

    public DefaultLocationTracker(Application application, FusedLocationProviderClient client) {
        this.application = application;
        this.client = client;
    }

    @Override
    public Location getCurrentLocation() {
        boolean hasAccessCoarseLocationPermission = ContextCompat.checkSelfPermission(
                application,
                Manifest.permission.ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED;
        boolean hasAccessFineLocationPermission = ContextCompat.checkSelfPermission(
                application,
                Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED;

        LocationManager locationManager = (LocationManager) application.getSystemService(Context.LOCATION_SERVICE);
        boolean isGpsEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

        if (!hasAccessCoarseLocationPermission||!hasAccessFineLocationPermission||!isGpsEnabled) {
            return null;
        }

        return null;
    }
}
