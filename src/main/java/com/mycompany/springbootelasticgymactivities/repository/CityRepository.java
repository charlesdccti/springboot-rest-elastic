package com.mycompany.springbootelasticgymactivities.repository;

import com.mycompany.springbootelasticgymactivities.model.City;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CityRepository extends ElasticsearchRepository<City, String> {

}
