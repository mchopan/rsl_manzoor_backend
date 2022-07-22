package com.project_news.Service.LocationServices;

import com.project_news.Entity.Location;
import com.project_news.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public Location getLocationById(Long locationId) {
        return locationRepository.findById(locationId).get();
    }

    @Override
    public void deleteLocation(Long locationId) {
        locationRepository.deleteById(locationId);
    }

    @Override
    public Location updateLocation(Long locationId, Location location) {
        Location editLocation = locationRepository.findById(locationId).get();

        if(Objects.nonNull(location.getLocationName()) && !" ".equalsIgnoreCase((location.getLocationName()))){
            editLocation.setLocationName(location.getLocationName());
        }
        return locationRepository.save(editLocation);
    }
}
