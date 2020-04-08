package com.mycompany.springbootelasticgymactivities.service;

import com.mycompany.springbootelasticgymactivities.model.City;

public interface CityService {

    Iterable<City> findAll();
    
}