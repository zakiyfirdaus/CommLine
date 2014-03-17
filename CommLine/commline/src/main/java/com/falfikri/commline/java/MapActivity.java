package com.falfikri.commline.java;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.falfikri.commline.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by zakiy on 3/17/14.
 */
public class MapActivity extends Activity{
    private GoogleMap mGoogleMap;
    private Location mCurrentLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        initializeMap();
    }

    @Override
    protected void onResume() {

        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MapActivity.this);

        alertDialogBuilder.setTitle("Exiting App");
        alertDialogBuilder.setMessage("Are you sure you want to exit?");
        alertDialogBuilder.setPositiveButton("Yes, exit the app",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
                MapActivity.this.finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void initializeMap(){
        if (mGoogleMap == null) {
            mGoogleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

            if (mGoogleMap == null) {
                Toast.makeText(getApplicationContext(), "Sorry! unable to create maps",
                        Toast.LENGTH_SHORT).show();
            } else {
                mGoogleMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
                    @Override
                    public void onMyLocationChange(Location location) {
                        mCurrentLocation = location;
                    }
                });
                mGoogleMap.getUiSettings().setMyLocationButtonEnabled(true);
                mGoogleMap.getUiSettings().setZoomControlsEnabled(true);
                mGoogleMap.getUiSettings().setRotateGesturesEnabled(false);
                mGoogleMap.setMyLocationEnabled(true);

                LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

                Criteria cri= new Criteria();
                String provider = locationManager.getBestProvider(cri, true);
                mCurrentLocation = locationManager.getLastKnownLocation(provider);
                LatLng currentLatLng;

                if(mCurrentLocation!=null){
                    currentLatLng = new LatLng(mCurrentLocation.getLatitude(),
                            mCurrentLocation.getLongitude());
                    mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(currentLatLng));
                    mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                } else {
//                    mCurrentLocation = new Location("dummyProvider");
//                    mCurrentLocation.setLatitude(getLatFromSharedPreference());
//                    mCurrentLocation.setLongitude(getLonFromSharedPreference());
//                    currentLatLng = new LatLng(getLatFromSharedPreference(),getLonFromSharedPreference());
                    try{
                        mCurrentLocation = mGoogleMap.getMyLocation();
                        Log.d("TAG LOC", "CUR LOC: " + mCurrentLocation.getLatitude() + "; "
                                + mCurrentLocation.getLongitude());

                        currentLatLng = new LatLng(mCurrentLocation.getLatitude(),mCurrentLocation.getLongitude());
                        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(currentLatLng));
                        mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    } catch (Exception e){

                    }
                }

                mGoogleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                    @Override
                    public void onInfoWindowClick(Marker marker) {

                    }
                });
            }

        }
    }
}
