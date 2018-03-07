package com.example.mansopresk07.googlemaps;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;



import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;

import com.google.android.gms.maps.model.PolylineOptions;

public class BankActivity extends Activity implements OnMapReadyCallback{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(17.4474, 78.3762), 2));

        // Polylines are useful for marking paths and routes on the map.
        googleMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng(17.437462, 78.448288))  // Ameerpet
                .add(new LatLng(17.439930, 78.498276))  //Secunderabad
                .add(new LatLng(16.544893, 81.521240))  // Bhimavaram
                .add(new LatLng(17.686815, 83.218483))// Vizag
        );

    }
}

