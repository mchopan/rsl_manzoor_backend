package com.project_news.Controller;

import com.project_news.Entity.Location;
import com.project_news.Service.LocationServices.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

//    ADD LOCATION'S IN DB
    @PostMapping("/addLocation")
    public Location addLocation(@RequestBody Location location){
        return locationService.addLocation(location);
    }

//    FETCH DATA FROM DB
    @GetMapping("/getLocation")
    public ArrayList<Location> getLocation(){
        return locationService.getLocation();
    }

//    FETCH DATA BY ID

    @GetMapping("/getLocation/{id}")
    public Location getLocationById(@PathVariable("id") Long locationId){
        return locationService.getLocationById(locationId);
    }
//     DELETE BY ID
    @DeleteMapping("/deleteLocation/{id}")
    public  String deleteLocationById(@PathVariable("id") Long locationId){
        locationService.deleteLocation(locationId);
        return "Location Deleted Successfully";
    }

    //UPDATE LOCATION BY ID
    @PutMapping("/updateLocation/{id}")
    public Location updateLocation(@PathVariable("id") Long locationId, @RequestBody Location location){
        return locationService.updateLocation(locationId, location);
    }
}
