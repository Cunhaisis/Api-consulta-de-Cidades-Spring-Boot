package com.devisis.citiesapi.cities.resources;

import com.devisis.citiesapi.cities.entities.City;
import com.devisis.citiesapi.cities.service.DistanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/neraby")
public class NearbyResource {

    private DistanceService distanceService;

    public NearbyResource(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @GetMapping
    public List<City> nearby(@RequestParam(name = "city_id") final Long cityId,
                             @RequestParam(name = "radius") final Double radius) {

        return distanceService.nearby(cityId, radius);
    }
}

