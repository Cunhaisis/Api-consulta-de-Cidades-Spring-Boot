package com.devisis.citiesapi.countries;

import com.devisis.citiesapi.countries.entities.Country;
import com.devisis.citiesapi.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conntries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }

    //@GetMapping // Traz todos os registros
    //public List<Country> countries(Pageable page) {
    //  return repositories.findAll();

    @GetMapping("/countries")
    public Page<Country> contries(Pageable page) {
        return repository.findAll((org.springframework.data.domain.Pageable) page);
        }
    @GetMapping("/{id}") //Busca por um unico Id
    public Country  getOne(@PathVariable Long id) {
        Optional<Country> optional = repository.findById(id);
        return optional.get();
    }

}


