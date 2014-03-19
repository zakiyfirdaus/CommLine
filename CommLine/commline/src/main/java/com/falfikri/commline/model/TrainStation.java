package com.falfikri.commline.model;

import android.location.Location;

import com.falfikri.commline.util.LocationUtility;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by zakiy on 3/17/14.
 */
public class TrainStation {
    private String mName;
    private Location mLocation;

    public TrainStation(String name, Location location){
        mName = name;
        mLocation = location;
    }

    public TrainStation(String name, double latitude, double longitude){
        mName = name;
        mLocation = LocationUtility.toLocation(latitude,longitude);
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public Location getLocation() {
        return mLocation;
    }

    public LatLng getLatLng(){
        return LocationUtility.toLatLng(mLocation);
    }

    public void setLocation(Location mLocation) {
        this.mLocation = mLocation;
    }
}
