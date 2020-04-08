package com.mycompany.springbootelasticgymactivities.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Geometry {

    // @Id
    private String id;
    private String type;
    private List<Coordinate> coordinates = new ArrayList<Coordinate>();
    
}