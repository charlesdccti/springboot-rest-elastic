package com.mycompany.springbootelasticgymactivities.service;

import com.mycompany.springbootelasticgymactivities.model.City;
import com.mycompany.springbootelasticgymactivities.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }
    
}