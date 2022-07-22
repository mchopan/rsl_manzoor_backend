package com.project_news.Service.LocationServices;

import com.project_news.Entity.Location;

import java.util.ArrayList;

public interface LocationService {
    Location addLocation(Location location);

    ArrayList<Location> getLocation();

    Location getLocationById(Long locationId);

    void deleteLocation(Long locationId);

    Location updateLocation(Long locationId, Location location);
}
