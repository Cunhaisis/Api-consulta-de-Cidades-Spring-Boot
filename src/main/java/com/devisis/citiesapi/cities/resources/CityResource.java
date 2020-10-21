package com.devisis.citiesapi.cities.resources;

import com.devisis.citiesapi.cities.entities.City;
import com.devisis.citiesapi.cities.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<City> cities(final Pageable page) {
        return repository.findAll((org.springframework.data.domain.Pageable) page);
    }
}