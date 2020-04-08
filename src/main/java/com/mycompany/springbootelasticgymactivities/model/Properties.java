package com.mycompany.springbootelasticgymactivities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    private float ID;
    private String NM_MUNICIP;
    private float UF;
    private String NM_REGIAO;
    private float REGIAO;
    private String SIGLA_UF;
    private String NM_UF;
    private float pop;
    private float valor_indi;
    private float decil_indi;
    private float quintil_in;
    private float renda_perc;
    private float analf_7mai;
    private float cond_habit;
    private float Xmin;
    private float Ymin;
    private float Xmax;
    private float Ymax;
    private String bounds;
    private float graf_barra;
}
