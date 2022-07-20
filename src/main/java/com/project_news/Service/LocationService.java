package com.project_news.Service;

import com.project_news.Entity.Location;

import java.util.ArrayList;

public interface LocationService {
    Location addLocation(Location location);

    ArrayList<Location> getLocation();
}
