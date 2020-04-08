package com.mycompany.springbootelasticgymactivities.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geometry {

    private String type;
    private ArrayList<Object> coordinates = new ArrayList<Object>();

}