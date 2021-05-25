package com.example.Gestion.de.Stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adress implements Serializable {

    private String adress1;
    private String adress2;
    private String ville;
    private String codePostal;
    private String pays;
}
