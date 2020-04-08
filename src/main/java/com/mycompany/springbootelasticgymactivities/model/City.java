package com.mycompany.springbootelasticgymactivities.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(indexName = "deprivation_index", type = "municipality")
public class City {
    
    @Id
    private String id;
    private String type;

    @Field(type = FieldType.Object)
    private Geometry geometry;
    
    @Field(type = FieldType.Object)
    private Properties properties;

}