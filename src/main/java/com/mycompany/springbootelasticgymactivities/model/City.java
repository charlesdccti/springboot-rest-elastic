package com.mycompany.springbootelasticgymactivities.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@Document(indexName = "deprivation_index", type = "municipality")
public class City {
    
    @Id
    private String id;
    private String type;
    //@Transient
    // private Geometry geometry;
    // private Properties properties;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

}