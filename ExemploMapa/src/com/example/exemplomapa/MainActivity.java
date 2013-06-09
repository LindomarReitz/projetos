package com.example.exemplomapa;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class MainActivity extends MapActivity {
    MapView mapView = null;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mapView = (MapView) findViewById(R.layout.main);
        
        setContentView(mapView);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	boolean b = super.onTouchEvent(event);
    	
    	int x = (int) event.getX();
    	int y = (int) event.getY();
    	
    	GeoPoint point = mapView.getProjection().fromPixels(x,y);
    	
    	Toast.makeText(this, "Latitude: " + point.getLatitudeE6() + 
    			" - Longitude: " + point.getLongitudeE6(), Toast.LENGTH_SHORT).show();
    	
    	return b;
    }
    
	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}