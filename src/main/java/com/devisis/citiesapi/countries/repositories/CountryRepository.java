package com.devisis.citiesapi.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devisis.citiesapi.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
