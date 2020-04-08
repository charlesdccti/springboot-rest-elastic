package com.mycompany.springbootelasticgymactivities.model;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    public long ID;
    public String NM_MUNICIP;
    public long UF;
    public String NM_REGIAO;
    public long REGIAO;
    public String SIGLA_UF;
    public String NM_UF;
    public float pop;
    public float valor_indi;
    public float decil_indi;
    public float quintil_in;
    public float renda_perc;
    public float analf_7mai;
    public float cond_habit;
    public float Xmin;
    public float Ymin;
    public float Xmax;
    public float Ymax;
    public String bounds;
    public float graf_barra;
}
