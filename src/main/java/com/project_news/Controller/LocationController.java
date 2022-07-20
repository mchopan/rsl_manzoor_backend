package com.project_news.Controller;

import com.project_news.Entity.Location;
import com.project_news.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
