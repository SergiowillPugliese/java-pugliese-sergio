package com.esame.esame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Preventivo {
    private Integer id;
    private String nome;
    private String piano;
    private Integer max_fermate;
    private Integer max_extraurbane;
    private Integer max_zone;
    private Double prezzo;
}
