package com.project_news.Service;

import com.project_news.Entity.Location;
import com.project_news.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public ArrayList<Location> getLocation() {
        return( ArrayList<Location> )locationRepository.findAll();
    }
}
