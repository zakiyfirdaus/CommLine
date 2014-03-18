package com.falfikri.commline.util;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by zakiy on 3/17/14.
 */
public class LocationUtility {
    public static Location toLocation(LatLng latLng){
        Location location = new Location("");
        location.setLatitude(latLng.latitude);
        location.setLongitude(latLng.longitude);

        return location;
    }

    public static LatLng toLatLng(Location location){
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        return latLng;
    }

    public static Location toLocation(double latitude, double longitude){
        Location location = new Location("");
        location.setLatitude(latitude);
        location.setLongitude(longitude);

        return location;
    }

    public static LatLng toLatLng(double latitude, double longitude){
        LatLng latLng = new LatLng(latitude, longitude);
        return latLng;
    }
}
