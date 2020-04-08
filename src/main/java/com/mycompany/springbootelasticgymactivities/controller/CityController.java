package com.mycompany.springbootelasticgymactivities.controller;

import com.mycompany.springbootelasticgymactivities.model.City;
import com.mycompany.springbootelasticgymactivities.service.CityServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    
    @Autowired
    private CityServiceImpl cityServiceImpl;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all")
    public Iterable<City> findAllProducts() {
        return cityServiceImpl.findAll();
    }
}