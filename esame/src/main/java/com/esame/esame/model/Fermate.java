package com.esame.esame.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fermate implements Serializable {
    private Integer id;
    private String nome;
    private String zona;
}
