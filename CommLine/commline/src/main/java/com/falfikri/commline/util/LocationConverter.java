package com.falfikri.commline.util;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by zakiy on 3/17/14.
 */
public class LocationConverter {
    public static LatLng toLatLng(Location location){
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        return latLng;
    }

    public static Location toLocation(LatLng latLng){
        Location location = new Location("Test");
        location.setLatitude(latLng.latitude);
        location.setLongitude(latLng.longitude);

        return location;
    }
}
