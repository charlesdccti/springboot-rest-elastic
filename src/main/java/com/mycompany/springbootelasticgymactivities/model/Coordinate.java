package com.mycompany.springbootelasticgymactivities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coordinate {
    
    // private String id;
    // podemos tentar um tipo float aqui
    private Double latutude;
    private Double longitude;

}
